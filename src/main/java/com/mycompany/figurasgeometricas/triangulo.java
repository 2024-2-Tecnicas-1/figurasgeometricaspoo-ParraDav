package com.mycompany.figurasgeometricas;

/**
 *
 * @author dfpar
 */
public class triangulo extends figuraGeometrica {

    private double base;
    private double altura;

//constructor triangulo
    public triangulo(String name, String color, double base, double altura) {
        super(name, color);
        this.base = base;
        this.altura = altura;

    }
//área del triangulo

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }
//según consulta realizada, es una abreviación del metodo para obtener el perimetro solo con la base y altura

    @Override
    public double obtenerPerimetro() {
        return base * 3;
    }

}
