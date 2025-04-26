/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.figuras;

/**
 *
 * @author Maicol
 */
public class triangle extends figureGeometric{
    private double base;
    private double height;

    public triangle(double base, double height) {
        super("Triangle", "Triángulo");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}