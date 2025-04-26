/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payment;

/**
 *
 * @author Maicol
 */

public class Discounts {
    private String errorMessage = "";
    private double arl = 0;
    private double pension = 0;
    private double health = 0;
    private double totalDiscounts = 0;

    public double getArl(int risk) {
        switch(risk) {
            case 1 -> { return 0.00522; }
            case 2 -> { return 0.01044; }
            case 3 -> { return 0.02436; }
            case 4 -> { return 0.04350; }
            default -> {
                this.errorMessage = "This level doesn't exist";
                return 0;
            }
        }
    }

    public void initDiscounts(int salary, int risk) {
        this.arl = salary * getArl(risk);
        this.pension = salary * 0.04;
        this.health = salary * 0.04;
        this.totalDiscounts = this.health + this.pension + this.arl;
    }

    public void showDiscounts() {
        System.out.println("Pension: " + this.pension);
        System.out.println("Health: " + this.health);
        System.out.println("Arl: " + this.arl);
        System.out.println("Total discount: " + this.totalDiscounts);
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public double getTotalDiscounts() {
        return this.totalDiscounts;
    }
}
