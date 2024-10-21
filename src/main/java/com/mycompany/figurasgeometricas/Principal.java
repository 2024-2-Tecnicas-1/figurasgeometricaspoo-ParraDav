package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        figuraGeometrica figura = null;
        System.out.println("Ingrese el nombre de la figura");
        String name = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de figura");
        System.out.println("1. Circulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        int tipo = sc.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Ingrese el radio del circulo");
                double radio = sc.nextDouble();
                figura = new circulo(name, color, radio);
                break;

            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                double lado2 = sc.nextDouble();
                figura = new rectangulo(name, color, lado1, lado2);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triangulo");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                double altura = sc.nextDouble();
                figura = new triangulo(name, color, base, altura);
                break;
            default:
                System.out.println("Opcion no valida");
        }
        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());

    }
}
