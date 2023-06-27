package org.antoniodelgrecodiego.Utils;

import java.util.Scanner;

public class Consola {
    private static String textoIn;
    private static Integer numeroIn;
    private static Double decimalIn;
    private static Long longIn;
    private static Scanner sc = new Scanner(System.in);

    private Consola(){}

    public static String leerString(){
        textoIn = sc.nextLine();
        return textoIn;
    }
    public static Integer leerInt(){
        numeroIn = sc.nextInt();
        sc.nextLine();
        return numeroIn;
    }
    public static Double leerDouble(){
        decimalIn = sc.nextDouble();
        sc.nextLine();
        return decimalIn;
    }

    public static Long leerLong(){
        longIn = sc.nextLong();
        sc.nextLine();
        return longIn;
    }

    public static void siguiente(){
        sc.next();
    }

    public static void printLn(String oracion){
        System.out.println(oracion);
    }
}
