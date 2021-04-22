/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cofee;

import java.util.Scanner;

/**
 *
 * @author Мартин
 */
public class CoffeMachine {

    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert coins and press 0 to continue with selection");
        int sum = 0;
        int coin;
        int drink;
        int esspreso = 10;
        int longEsspreso = 10;
        int macchiato = 15;
        int mocca = 20;
        int cappuccino = 20;
        int nesscafe = 20;
        int tea = 30;
        int icecafe = 25;

        while (true) {

            coin = Integer.valueOf(reader.nextLine());
            //Тука ги дефинирам паричките да бидат 1,2,5,10 или 50
            if (coin != 1 && coin != 2 && coin != 5 && coin != 10 && coin != 50) {
                //се печати грешка ако не се внесе соодветна паричка
                System.out.println("You pushed invalid coin");
            } else {
                sum = sum + coin;

                System.out.println("Credit:" + sum);
                //Тука сакам кога ќе внесам 5 од тастатура да не ме праша одма за селекција на 
                //пијалок туку да можам да продолжам со внесување на уште парички додека не внесам 
                // 0 од тастатура
            }

            System.out.println("Select your drink [1-8]");
            drink = Integer.valueOf(reader.nextLine());
            //Тука се прави избор и соодветно се намалува кредитот
            
            //Тука треба да се напише услов дека кредитот треба да биде >= од цената на
            //избраниот пијаок
            if ((drink == 1)&&(sum >= esspreso)) {
                sum = sum - esspreso;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 2)&&(sum >= longEsspreso)) {
                sum = sum - longEsspreso;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 3)&&(sum >= macchiato)) {
                sum = sum - macchiato;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 4)&&(sum >= mocca)) {
                sum = sum - mocca;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 5)&&(sum >= cappuccino)) {
                sum = sum - cappuccino;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 6)&&(sum >= nesscafe)) {
                sum = sum - nesscafe;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 7)&&(sum >= tea)) {
                sum = sum - tea;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            } else if ((drink == 8)&&(sum >= icecafe)) {
                sum = sum - icecafe;
                System.out.println("Loading...");
                Thread.sleep(5000);
                System.out.println("You can pick your drink!");
                System.out.println("Available credit:" + sum);
            }
            else System.out.println("Invalid selection");

        }
    }
}
