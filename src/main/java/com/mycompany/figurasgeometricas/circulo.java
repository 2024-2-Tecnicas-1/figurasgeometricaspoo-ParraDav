package com.mycompany.figurasgeometricas;

/**
 *
 * @author dfpar
 */
public class circulo extends figuraGeometrica {

    private double radio;

//constructor circulo
    public circulo(String name, String color, double radio) {
        super(name, color);
        this.radio = radio;

    }
//getter del radio

    public double getRadio() {
        return radio;
    }

//setter del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

//área del circulo  
    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
//perímetro del circulo  

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

}
