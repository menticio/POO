/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.figuras;

/**
 *
 * @author Maicol
 */
public class square extends figureGeometric{
    private double side;

    public square(double side) {
        super("Square", "Cuadrado");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
