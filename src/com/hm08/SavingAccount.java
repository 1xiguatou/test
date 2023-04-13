package com.hm08;

public class SavingAccount extends BankAccount{
    private double interestRate = 0.03;//利率
    private int chance = 3;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public void deposit(double amount) {
        if (chance <= 0) {
            super.deposit(amount-1);
            return;
        }
        chance--;
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (chance <= 0) {
            super.withdraw(amount + 1);
            return;
        }
        chance--;
        super.withdraw(amount);
    }

    public void earnMonthlyInterest(){
        chance = 3;
        super.deposit(getBalance()*interestRate);
    }



}
