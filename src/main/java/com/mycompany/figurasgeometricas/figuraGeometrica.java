package com.mycompany.figurasgeometricas;

/**
 *
 * @author dfpar
 */
public class figuraGeometrica {

//atributos de las figuras geometricas
    protected String name;
    protected String color;

//contructor de las figuras
    public figuraGeometrica(String name, String color) {
        this.name = name;
        this.color = color;
    }

//getter de los atributos
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
//setter de los atributos

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
//obtener área

    public double obtenerArea() {

        return 0;
    }

//obtener perimetro    
    public double obtenerPerimetro() {

        return 0;
    }

}
