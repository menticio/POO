/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.payroll;

/**
 *
 * @author Maicol
 */
public abstract class person {
    protected String names;
    protected String lastNames;
    protected int daysWorked;
    protected int dayValue;
    protected int transport;
    protected double salary;
    protected String position;

    public person(String names, String lastNames, int daysWorked, int dayValue, int transport, double salary, String position) {
        this.names = names;
        this.lastNames = lastNames;
        this.daysWorked = daysWorked;
        this.dayValue = dayValue;
        this.transport = transport;
        this.salary = salary;
        this.position = position;
    }

    public String getNames() { return names; }
    public String getLastNames() { return lastNames; }
    public int getDaysWorked() { return daysWorked; }
    public int getDayValue() { return dayValue; }
    public int getTransport() { return transport; }
    public double getSalary() { return salary; }
    public String getPosition() { return position; }

    public abstract double calculateSalary();
    public abstract void show();
} 