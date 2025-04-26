/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maicol.institution;

/**
 *
 * @author Maicol
 */

public class Institution {
    public static void main(String[] args) {
        User person = new User("License A");

        System.out.println(person.showUser());
        System.out.println(person.showLicence());
    }
}

