package com.hm08;

public class CheckingAccount extends BankAccount{
    private double charge = 1;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    //扩展 对每次存款和取款都收取1美元的手续费


    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    @Override
    public void deposit(double amount) {
        if (getBalance() + amount -charge < 0){
            return;
        }
        super.deposit(amount - charge);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount -charge <0){
            return;
        }
        super.withdraw(amount + 1);
    }
}
