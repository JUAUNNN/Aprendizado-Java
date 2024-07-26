package br.com.alura.estudos.calculadora;

import br.com.alura.estudos.calculadora.GeometricCalculus;

import java.util.Scanner;

public class RectangularRoomCalculator implements GeometricCalculus {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    Scanner input = new Scanner(System.in);


    @Override
    public void calculateArea() {

        double area = height*width;
        System.out.println("A área do retangulo é: " +area);
    }

    @Override
    public void calculatePerimeter() {

        double perimeter = 2*(height+width);
        System.out.println("O perimetro do retangulo é: " +perimeter);

    }
}
