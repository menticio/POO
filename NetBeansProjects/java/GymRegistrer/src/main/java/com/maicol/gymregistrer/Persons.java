/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.gymregistrer;

/**
 *
 * @author Maicol
 */
public abstract class Persons {
    private final String name;
    private final String lastName;
    private final int identification;
    private final float weight;
    private final float stature;

    public Persons(String name, String lastName, int identification, float weight, float stature) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.weight = weight;
        this.stature = stature;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdentification() {
        return identification;
    }

    public float getWeight() {
        return weight;
    }

    public float getStature() {
        return stature;
    }
}
