/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.institution;

/**
 *
 * @author Maicol
 */
public abstract class Person {
    private final String name;
    private final String lastName;
    private final int identification;
    private final int telephone;
    private final String rh;
    private final String address;

    public Person(String name, String lastName, int identification, int telephone, String rh, String address) {
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.telephone = telephone;
        this.rh = rh;
        this.address = address;
    }

    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public int getIdentification() { return identification; }
    public int getTelephone() { return telephone; }
    public String getRh() { return rh; }
    public String getAddress() { return address; }
}

