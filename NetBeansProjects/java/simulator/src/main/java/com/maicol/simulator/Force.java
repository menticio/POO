/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.simulator;

/**
 *
 * @author Maicol
 */
  public abstract class Force {
    private final float mass;
    private final float acceleration;

    public Force(float mass, float acceleration) {
        this.mass = mass;
        this.acceleration = acceleration;
    }

    public float getMass() {
        return mass;
    }

    public float getAcceleration() {
        return acceleration;
    }
}
