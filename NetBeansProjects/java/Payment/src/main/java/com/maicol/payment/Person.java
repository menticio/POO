/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payment;

/**
 *
 * @author Maicol
 */

   public abstract class Person {
    private final String name;
    private final int salary;
    private final int overtime;
    private final String scheduleType;

    public Person(String name, int salary, int overtime, String scheduleType) {
        this.name = name;
        this.salary = salary;
        this.overtime = overtime;
        this.scheduleType = scheduleType;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getOvertime() {
        return overtime;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public abstract double calculateSalary();
}