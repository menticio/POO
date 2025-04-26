/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.figuras;

/**
 *
 * @author Maicol
 */  
public abstract class figureGeometric {
    private String name;
    private String spanishName;

    public figureGeometric(String name, String spanishName) {
        this.name = name;
        this.spanishName = spanishName;
    }

    public String getName() {
        return name;
    }

    public String getSpanishName() {
        return spanishName;
    }

    public abstract double calculateArea();
}
