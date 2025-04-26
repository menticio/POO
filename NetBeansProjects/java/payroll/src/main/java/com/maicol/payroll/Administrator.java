/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payroll;

/**
 *
 * @author Maicol
 */
   public class Administrator extends person {

    public Administrator() {
        super("Carla Sofia", "Zuleta Dussan", 12, 87000, (12 * 87000 < 2000000) ? 200000 : 0, 12 * 87000, "Administrator");
    }

    @Override
    public double calculateSalary() {
        return (getDaysWorked() * getDayValue()) - 0; 
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
        System.out.println("For obtaining a full payment of: " + calculateSalary() + "$");
    }
}
