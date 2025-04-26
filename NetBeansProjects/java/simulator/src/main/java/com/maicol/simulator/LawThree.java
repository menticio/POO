/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.simulator;

/**
 *
 * @author Maicol
 */
public class LawThree{

    public void optionReviewLawThree(String name, Force force) {
        if (name.equals("Law Three")) {
            calculateForceLawThree(force);
        } else {
            System.out.println("Unknown law");
        }
    }

    public void calculateForceLawThree(Force force) {
        float forceValue = force.getMass() * force.getAcceleration();
        System.out.println("The action force is: " + forceValue + " N.");
        System.out.println("According to Newton's third law, the reaction force is " + (-forceValue) + " N.");
    }
}
