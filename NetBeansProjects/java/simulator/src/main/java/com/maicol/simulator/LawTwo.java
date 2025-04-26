/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.simulator;

/**
 *
 * @author Maicol
 */
public class LawTwo{

    public void optionReviewLawTwo(String name, Force force) {
        if (name.equals("Law Two")) {
            calculateForceLawTwo(force);
        } else {
            System.out.println("Unknown law");
        }
    }

    public void calculateForceLawTwo(Force force) {
        System.out.println("According to Newton's second law, the reaction force is " + force.getMass() + " * " + force.getAcceleration());
        float forceValue = force.getMass() * force.getAcceleration();
        System.out.println("giving a result of: " + forceValue + " N.");
    }
}
