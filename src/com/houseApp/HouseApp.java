package com.houseApp;

import java.util.Scanner;

public class HouseApp {

    Scanner scanner = new Scanner(System.in);
    private int choice;
    boolean loop = true;
    public void mainMenu(){
        do {
            System.out.println("-----------------房屋出租系统----------------");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退       出");
            System.out.println("请选择的功能：（1-6）");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    new House().Add();
                    break;
                case 2:
                    SearchHouse se = new SearchHouse();
                    se.search();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    new House().listHouse();
                    break;
                case 6:
                    this.exit();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }while (loop);
        System.out.println("退出成功！！！");
    }
    public void exit(){
        String flag;
        while (true){
            System.out.println("是否确定退出？输入y/n");
            flag = scanner.next();
            if ("y".equals(flag) || "n".equals(flag))
                break;
            System.out.println("输出错误，请重新出入");
        }

        if ("y".equals(flag)){
            loop = false;
            return;
        }

    }


}
