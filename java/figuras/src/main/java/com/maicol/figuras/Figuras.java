/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maicol.figuras;

/**
 *
 * @author Maicol
 */
public class Figuras{
    public static void main(String[] args) {
        circle circle = new circle(32);
        triangle triangle = new triangle(12, 15);
        rectangle rectangle = new rectangle(14, 180);
        square square = new square(295);

        System.out.println("=== Information of the Figures ===");

        printFigureInfo(circle);
        printFigureInfo(triangle);
        printFigureInfo(rectangle);
        printFigureInfo(square);
    }

    public static void printFigureInfo(figureGeometric figure){
        System.out.println("\nName of figure: " + figure.getName());
        System.out.println("Name in Spanish: " + figure.getSpanishName());
        System.out.println("Area: " + figure.calculateArea());
    }
}
