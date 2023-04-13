package com.hm08;

public class Homework08 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
        savingAccount.withdraw(100);
        System.out.println(savingAccount.getBalance());
    }
}
