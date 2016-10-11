/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

/**
 *
 * @author Estudiante
 */
public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
    return (Math.pow(this.radio, 2)*Math.PI);
    }
}
