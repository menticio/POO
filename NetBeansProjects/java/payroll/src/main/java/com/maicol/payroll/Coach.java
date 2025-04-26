/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payroll;

/**
 *
 * @author Maicol
 */
public class Coach extends person {
    private final int customersAttended;
    private final int bonus;
    private final int totalBonus;

    public Coach(int customersAttended, int bonus) {
        super("Juanito of Jesus", "Perez Iguaran", 27, 45000, (27 * 45000 < 2000000) ? 200000 : 0, 27 * 45000, "Coach");
        this.customersAttended = customersAttended;
        this.bonus = bonus;
        this.totalBonus = (customersAttended / 5) * bonus;
    }

    @Override
    public double calculateSalary() {
        return (getDaysWorked() * getDayValue()) - totalBonus;
    }

    public int getTotalBonus() {
        return totalBonus;
    }

    public int getCustomersAttended() {
        return customersAttended;
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
        System.out.println("With " + getCustomersAttended() + " customers attended");
        System.out.println("Gaining a bonus of: " + getTotalBonus() + "$");
        System.out.println("For obtaining a full payment of: " + calculateSalary() + "$");
    }
}
