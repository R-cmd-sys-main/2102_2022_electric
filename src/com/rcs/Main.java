package com.rcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceKwh = 0.15;
//        int days = 21;
        int lastMonth = 7535;

        System.out.println("Ievadi skaitītāja rādījumu: ");
        int insert_data = scan.nextInt();
        System.out.println("Ievadi datumu: ");
        int days = scan.nextInt();

        int kwh = insert_data - lastMonth; // šomēness patērēts
        double sum = kwh * priceKwh;
        double daily = kwh / days;
        System.out.println(kwh + " kwh patērētas šobrīd");
        System.out.println( "Jāmaksā - " + sum + "eur" + " Vidējais elektrības patēriņš dienā - " + daily + "kwh");

    }
}
