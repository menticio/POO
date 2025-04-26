/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.figuras;

/**
 *
 * @author Maicol
 */
public class circle extends figureGeometric{
    private double radius;
    private final double PI = 3.1416;

    public circle(double radius) {
        super("Circle", "Círculo");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * PI;
    }
}