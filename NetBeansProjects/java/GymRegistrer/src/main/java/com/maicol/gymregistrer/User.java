/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.gymregistrer;

/**
 *
 * @author Maicol
 */
  public class User extends Persons {
    private final String plan;
    private final Plans plans;

    public User(String plan) {
        super("Arbol", "de dfsledas", 64, 60f, 1423424.60f);
        this.plan = plan;
        this.plans = new Plans();
    }

    public String getPlan() {
        return plan;
    }

    public void showUser() {
        System.out.println("<h1>The dates of user are</h1><hr>");
        System.out.println("The Name is: " + getName() + " <br><hr>");
        System.out.println("The LastName is: " + getLastName() + " <br><hr>");
        System.out.println("The Identification is: " + getIdentification() + " <br><hr>");
        System.out.println("The Weight is: " + getWeight() + "kg <br><hr>");
        System.out.println("The Stature is: " + getStature() + "cm <br><hr>");
    }

    public void showPlan() {
        System.out.println(plans.getErrorMessage());
        System.out.println(plans.plan(plan));
    }
}
