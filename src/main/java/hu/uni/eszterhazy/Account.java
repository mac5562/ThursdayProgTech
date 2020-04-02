package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.UUID;

public class Account implements Subject {

    private ArrayList<Observer> observers;
    private double balance;
    private String ownerName;
    private UUID id;
    private String state;

    @Override
    public String getState(){
        return state;
    }
    protected void setState(String state){
        this.state=state;
    }

    public Account(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
        id= UUID.randomUUID();
        observers= new ArrayList<>();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs: observers) {
            System.out.println(obs.notifyObserver());
        }
    }

    public void withdraw(Double amount){

        double modifiedAmount =
        this.balance-=amount*calculateBankingFee(withdrawStrategy,amount);
        setState("Whitdrawn");
        notifyObservers();


    }

    private Double calculateBankingFee(WithdrawStrategy strategy, Double amount) {
        return null;
    }


}
