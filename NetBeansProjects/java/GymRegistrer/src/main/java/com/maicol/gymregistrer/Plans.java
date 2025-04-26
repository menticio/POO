/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.gymregistrer;

/**
 *
 * @author Maicol
 */
public class Plans {
    private String errorMessage = "";

    public String plan(String planName) {
        switch (planName) {
            case "basic" -> {
                System.out.println("<h1>THE PLAN SELECT IS: BASIC</h1>");
                return "This plan have a cost  of $34000 access general of the GYM";
            }
            case "medium" -> {
                System.out.println("<h1>THE PLAN SELECT IS: MEDIUM</h1>");
                return "This plan have a cost  of $56000 includes directed classes in the GYM";
            }
            case "premium" -> {
                System.out.println("<h1>THE PLAN SELECT IS: PREMIUM</h1>");
                return "This plan have a cost  of $88000 Includes personal trainer and wet area in the GYM";
            }
            default -> {
                System.out.println("<h1>THE PLAN SELECT IS: ???</h1>");
                errorMessage = "error this isn't a plan";
                return errorMessage;
            }
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}