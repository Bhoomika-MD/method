package com.xworkz.chemika.internals;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber,double balance,String ownerName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.ownerName=ownerName;
    }
    @Override
    public String toString(){
        return "accountNumber :"+accountNumber+"balance :"+balance+"ownerName :"+ownerName;
    }
    @Override
    public int hashCode() {
        return 96;
    }
}
