/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.simulator;

/**
 *
 * @author Maicol
 */
 public class LawOne{

    public float validate(Force force) {
        return force.getMass() * force.getAcceleration();
    }

    public void result(float force) {
        if (force == 0) {
            System.out.println("The object maintains its state (at rest or in uniform motion).");
        } else {
            System.out.println("The object has a force of " + force + " N acting on it, but it still maintains its motion (unless external force changes this).");
        }
    }

    public void calculateForceLawOne(Force force) {
        float result = validate(force);
        result(result);
    }

    public void optionReviewLawOne(String name, Force force) {
        if (name.equals("Law One")) {
            calculateForceLawOne(force);
        } else {
            System.out.println("Unknown law");
        }
    }
}
