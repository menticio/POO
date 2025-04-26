/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.figuras;

/**
 *
 * @author Maicol
 */
public class rectangle extends figureGeometric{
    private double sideOne;
    private double sideTwo;

    public rectangle(double sideOne, double sideTwo) {
        super("Rectangle", "Rectángulo");
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double calculateArea() {
        return sideOne * sideTwo;
    }
}