/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payment;

/**
 *
 * @author Maicol
 */
public final class Worker extends Person {
    private final String position;
    private final int risk;
    private double extraPayment = 0;
    private int bonus = 1;
    private String errorMessage = "";

    public Worker(String position, int risk) {
        super("Julanito", 38000, 35, "Nighttime");
        this.position = position;
        this.risk = risk;

        initDiscounts(this.getSalary(), this.getRisk());

        switch (this.getScheduleType()) {
            case "Daytime":
                this.extraPayment = 1.25;
                break;
            case "Nighttime":
                this.extraPayment = 1.75;
                break;
            case "Holyday":
                this.extraPayment = 2;
                break;
            default:
                this.errorMessage = "The schedule doesn't exist";
                break;
        }
    }

    public int getBonus() {
        if (this.getSalary() < (2 * this.bonus)) {
            return this.bonus;
        } else {
            this.bonus = 0;
            return this.bonus;
        }
    }

    public double calculateHourSalary() {
        return this.getSalary() / (30 * 8);
    }

    public String getPosition() {
        return position;
    }

    public int getRisk() {
        return risk;
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateSalary() {
        return this.getSalary() + calculateExtra() + getBonus() - this.totalDiscounts;
    }

    public double calculateExtra() {
        return (this.extraPayment * this.getOvertime()) * calculateHourSalary();
    }

    public void show() {
        System.out.println("Dates of worker:");
        System.out.println("Name: " + this.getName());
        System.out.println("Mensual salary: " + this.getSalary());
        System.out.println("Hour salary: " + this.calculateHourSalary());
        System.out.println("Overtime: " + this.getOvertime());
        System.out.println("Work Schedule: " + this.getScheduleType());
        System.out.println("The payment of Extra hours is: " + this.calculateExtra());
        System.out.println("Position: " + this.getPosition());
        System.out.println("Risk: " + this.getRisk() + " " + this.errorMessage);
        System.out.println("The discounts are: ");
        showDiscounts();
        System.out.println("The total payment is: " + this.calculateSalary());
    }

    private double arl = 0;
    private double pension = 0;
    private double health = 0;
    private double totalDiscounts = 0;

    public double getArl(int risk) {
        switch (risk) {
            case 1 -> {
                return 0.00522;
            }
            case 2 -> {
                return 0.01044;
            }
            case 3 -> {
                return 0.02436;
            }
            case 4 -> {
                return 0.04350;
            }
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
}
