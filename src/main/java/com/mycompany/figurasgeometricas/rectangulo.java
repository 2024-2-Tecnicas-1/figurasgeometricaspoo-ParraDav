package com.mycompany.figurasgeometricas;

/**
 *
 * @author dfpar
 */
public class rectangulo extends figuraGeometrica {

    private double lado1;
    private double lado2;

//constructor rectangulo
    public rectangulo(String name, String color, double lado1, double lado2) {
        super(name, color);
        this.lado1 = lado1;
        this.lado2 = lado2;

    }
//área del rectángulo

    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }
//perímetro del rectángulo

    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }

}
