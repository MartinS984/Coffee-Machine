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

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert coins:");
        int sum = 0;
        int coin;

        while (true) {

            coin = Integer.valueOf(reader.nextLine());
            if (coin != 1 && coin != 2 && coin != 5 && coin != 10 && coin != 50) {
                System.out.println("You pushed invalid coin");

            } else {
                sum = sum + coin;
                System.out.println("Sum:" + sum);
            }

        }
    }
}
