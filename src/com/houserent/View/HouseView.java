package com.houserent.View;

import com.houserent.Service.HouseService;
import com.houserent.domain.House;
import com.houserent.utility.Utility;

import java.util.Scanner;

public class HouseView {

    private char key = ' ';
    private boolean loop = true;
    private HouseService houseService = new HouseService(1);

    public void searchHouse(){
        System.out.println("请输入要查找的编号：");
        int searchId = Utility.readInt();
        House find = houseService.search(searchId);
        if (find == null){
            System.out.println("搜索失败！");
            return;
        }
        System.out.println(find.toString());

    }

    public void delHouse(){
        System.out.println("请选择待删除的房屋编号:");
        int choice = Utility.readInt();
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            if (houseService.del(choice) == true){
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败！");
            }
        }else {
            return;
        }
    }


    public void listHouses(){
        System.out.println("=============房屋列表===============");
        System.out.println("编号\t\t房主\t\t电话\t\t\t地址\t\t\t月租\t\t\t状态（已出租/未出租）");
        House[] houses = houseService.info();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null)
                continue;
            System.out.println(houses[i].toString());
        }
    }

    public void addHouse(){
        System.out.println("=============添加房源信息===============");
        System.out.println("姓名：");
        String name = Utility.readString(5);
        System.out.println("电话：");
        String phone = Utility.readString(13);
        System.out.println("地址：");
        String address = Utility.readString(30);
        System.out.println("月租：");
        Scanner scanner = new Scanner(System.in);
        double rent = scanner.nextDouble();
        System.out.println("状态（未出租/已出租）：");
        String state = Utility.readString(6);
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house) == true){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    public void UpdateHouse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------修改房屋-------------------");
        System.out.println("请输入要查找的id(-1退出)：");
        int key = Utility.readInt();
        if (key == -1)
            return;
        House hs = houseService.search(key);
        if (hs == null){
            System.out.println("未找到此id 无法修改");
            return;
        }
        System.out.print("姓名(" + hs.getName()+")：");
        hs.setName(Utility.readString(10));
        System.out.print("电话("+hs.getPhone()+")：");
        hs.setPhone(Utility.readString(13));
        System.out.print("地址("+hs.getAddress()+")：");
        hs.setAddress(Utility.readString(30));
        System.out.print("月租("+hs.getRent()+")：");
        hs.setRent(scanner.nextDouble());
        System.out.print("状态（未出租/已出租）("+hs.getState()+")：");
        hs.setState(Utility.readString(10));
    }

    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    public void mainMenu(){
        do {
            System.out.println("=============房屋出租系统===============");
            System.out.println("\t\t\t1新 增 房 源");
            System.out.println("\t\t\t2查 找 房 源");
            System.out.println("\t\t\t3删 除 房 源");
            System.out.println("\t\t\t4修 改 房 源 信 息");
            System.out.println("\t\t\t5房 源 列 表");
            System.out.println("\t\t\t6退       出");
            System.out.println("请选择菜单(1-6)");
            key = Utility.readChar();

            switch (key){
                case '1':
                    this.addHouse();
                    break;
                case '2':
                    this.searchHouse();
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    this.UpdateHouse();
                    break;
                case '5':
                    this.listHouses();
                    break;
                case '6':
                    this.exit();
                    break;
            }
        }while (loop);


    }
}
