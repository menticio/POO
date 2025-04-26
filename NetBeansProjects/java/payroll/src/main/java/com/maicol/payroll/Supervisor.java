/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payroll;

/**
 *
 * @author Maicol
 */


/**
 *
 * @author Maicol
 */
   public class Supervisor extends person {
    private final int bonus;
    private final int totalBonus;
    private final Coach coach;

    public Supervisor(Coach coach, int bonus) {
        super("Julian Esteban", "Diaz", 27, 85000, (27 * 85000 < 2000000) ? 200000 : 0, 27 * 85000, "Supervisor");
        this.coach = coach;
        this.bonus = bonus;
        this.totalBonus = (coach.getCustomersAttended() / 5) * bonus;
    }

    @Override
    public double calculateSalary() {
        return (getDaysWorked() * getDayValue()) - totalBonus;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    @Override
    public void show() {
        System.out.println("Information of the worker: " + getPosition());
        System.out.println("Position: " + getPosition());
        System.out.println("Names and last names: " + getNames() + " " + getLastNames());
        System.out.println("Days worked: " + getDaysWorked());
        System.out.println("Day value: " + getDayValue() + "$");
        System.out.println("With a salary of: " + getSalary() + "$");
        System.out.println("With a transport allowance of: " + getTransport() + "$");
        System.out.println("Gaining a bonus of: " + getTotalBonus() + "$");
        System.out.println("For obtaining a full payment of: " + calculateSalary() + "$");
    }
}