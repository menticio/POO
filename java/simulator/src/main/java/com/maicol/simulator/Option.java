/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.simulator;

/**
 *
 * @author Maicol
 */
public class Option extends Force {

    private final String name;
    private LawOne lawOne;
    private LawTwo lawTwo;
    private LawThree lawThree;

    public Option(String name) {
        super(123.65f, 317.5f);
        this.name = name;
        this.lawOne = new LawOne();
        this.lawTwo = new LawTwo();
        this.lawThree = new LawThree();
    }

    public void review() {
        switch (name) {
            case "Law One" -> {
                System.out.println("Results with Law One: ");
                lawOne.optionReviewLawOne(name, this);
            }
            case "Law Two" -> {
                System.out.println("Results with Law Two: ");
                lawTwo.optionReviewLawTwo(name, this);
            }
            case "Law Three" -> {
                System.out.println("Results with Law Three: ");
                lawThree.optionReviewLawThree(name, this);
            }
            default -> System.out.println("This law doesn't exist");
        }
    }
}
