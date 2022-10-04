package edu.uchicago.gerber.labjava.lec01.glab;

import java.util.Date;

public class Player  {

    private String name; // obj
    private double money;  // primitive
    private Date inception; // obj

    public Player(String name, double money) {  // constructor
        this.name = name;
        this.money = money;
        this.inception = new Date();
    }


    public String getName() {
        return name;
    }  // command + N: getters / setters

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getInception() {
        return inception;
    }

    public void setInception(Date inception) {
        this.inception = inception;
    }


}
