package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(200,25); //создала экземпляр класса Hero
        Boss boss = new Boss(400,50," ");
        System.out.println("Boss Health "+ boss.getHealth() + " " + boss.getDamage()+" "+boss.getDefenceType());




    }
}
