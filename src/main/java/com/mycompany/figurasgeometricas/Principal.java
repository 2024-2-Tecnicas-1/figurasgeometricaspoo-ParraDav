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

        System.out.println("1. Circulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        tipo = sc.next().charAt(0);
        tipo = Character.toLowerCase(tipo);
        switch (tipo) {
            case '1':
                System.out.println("Ingrese el radio del circulo");
                double redio = sc.nextDouble();

            case '2':
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                double lado2 = sc.nextDouble();
            case '3':
                System.out.println("Ingrese el valor de la base del triangulo");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                double altura = sc.nextDouble();
            default:
                break;
        }

    }
}
