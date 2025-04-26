/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maicol.ejemplo1;

/**
 *
 * @author Maicol
 */
 public class EJEMPLO1{
    public static void main(String[] args) {
        vendedor vendedor = new vendedor();
        vendedor.setName("unArvol");

        supervisor supervisor = new supervisor();
        supervisor.setName("Felipe");

        System.out.println("Nombre del vendedor:   " + vendedor.getName());
        System.out.println("Nombre del supervisor: " + supervisor.getName());
    }
}

