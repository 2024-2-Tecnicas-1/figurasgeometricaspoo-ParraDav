package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String name = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de figura");
        char tipo = ' ';
        do {
            System.out.println("1. Circulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            tipo = sc.next().charAt(0);
            tipo = Character.toLowerCase(tipo);
            switch (tipo) {
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                default:
                    throw new AssertionError();
            }
        } while (tipo != '0');

    }
}
