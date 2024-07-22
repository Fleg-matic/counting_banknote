package com.perso;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int sum = 1783;
        System.out.println("Somme à décomposer : " + sum + "\n");

        int billets100 = sum / 100;
        int reste100 = sum % 100;
        if (sum >= 100) {
            System.out.println(billets100 + " billets de 100 euros, il reste " + reste100);
        }

        int billets50 = reste100 / 50;
        int reste50 = reste100 % 50;
        if (reste100 >= 50) {
            System.out.println(billets50 + " billets de 50 euros, il reste " + reste50);
        }

        int billets20 = reste50 / 20;
        int reste20 = reste50 % 20;
        if (reste50 >= 20) {
            System.out.println(billets20 + " billets de 20 euros, il reste " + reste20);
        }

        int billets10 = reste20 / 10;
        int reste10 = reste20 % 10;
        if (reste20 >= 10) {
            System.out.println(billets10 + " billets de 10 euros, il reste " + reste10);
        }

        int pieces2 = reste10 / 2;
        int reste2 = reste10 % 2;
        if (reste10 >= 2) {
            System.out.println(pieces2 + " pièces de 2 euros, il reste " + reste2);
        }

        int pieces1 = reste2 / 1;
        if (reste2 == 1) {
            System.out.println(pieces1 + " pièces de 1 euros");
        }

    }
}