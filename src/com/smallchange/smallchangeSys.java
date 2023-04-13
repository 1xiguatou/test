package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallchangeSys {
    //化繁为简
    //1. 先完成显示菜单，并可以选择菜单，给出相应提示
    //2. 零钱通明细，使用字符串拼接
    //3. 收益入账（钱数 时间 余额）
    //4. 消费（钱数 时间 余额）
    public static void main(String[] args) {

        //1. 先完成显示菜单，并可以选择菜单，给出相应提示
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        //2. 零钱通明细，使用字符串拼接
        String details = "---------------零钱通明细----------------";

        //3.完成收益入账（钱数 时间 余额） 完成功能驱动程序员增加新的变化和代码
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//格式化时间
        //4. 消费（消费说明 钱数 时间 余额）
        String payDetail = "";
        //5.改进退出功能
        String exit = "";

        do {
            System.out.println("\n==================欢迎来到零钱通===============");
            System.out.println();
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退      出");
            System.out.print("请选择(1-4)：");
            choice = scanner.next();

            switch (choice){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    //找出不正确的金额条件给出提示，然后就break
                    System.out.println("2.---------收益入账----------");
                    System.out.print("请输入收益：\t");
                    money = scanner.nextDouble();

                    if (money <= 0){
                        System.out.println("收益小于0 错误！！！！");
                        break;
                    }
                    //进行拼接
                    balance += money;
                    date = new Date(); //获取时间
                    details += "\n收益入账\t+" + money +"\t"+ simpleDateFormat.format(date)+"\t余额：" + balance;

                    break;
                case "3":
                    System.out.print("请输入消费说明: ");
                    payDetail = scanner.next();
                    System.out.println();
                    System.out.print("请输入消费金额：");
                    money = scanner.nextDouble();

                    if ((balance - money) < 0 || money <= 0){
                        System.out.println("你的消费金额应该在0-" + balance);
                        break;
                    }

                    balance -= money;
                    //拼接信息到details
                    details += "\n" + payDetail + "\t-" + money + "\t" + simpleDateFormat.format(date)+"\t余额：" + balance;

                    break;
                case "4":

                    //建议一段代码实现一个功能 不要混在一起
                    while (true){  //要求用户必须输入y/n
                        System.out.println("你确定要退出吗？ y/n");
                        exit = scanner.next();
                        if (exit.equals("y") || exit.equals("n")){
                            break;
                        }
                    }
                    //"y".equals(exit)
                    if ("y".equals(exit)){
                        loop = false;
                    }
                    break;
            }
        }while (loop);
        System.out.println("退出成功！");
    }
}
