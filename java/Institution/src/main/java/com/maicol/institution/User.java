/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.institution;

/**
 *
 * @author Maicol
 */
public class User extends Person implements Licences {
    private final String licence;
    private String messageError = "";

    public User(String licence) {
        super("Juancito", "Diaz", 3, 312123132, "A", "wood");
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public String showUser() {
        return """
            <h1>The dates of the user are</h1><hr>
            The Name is: %s <br><hr>
            The LastName is: %s <br><hr>
            The Identification is: %d <br><hr>
            The rh is: %s <br><hr>
            The Address is: %s <br><hr>
            """.formatted(getName(), getLastName(), getIdentification(), getRh(), getAddress());
    }

    @Override
    public String licence() {
        String result;
        switch (licence) {
            case "License A" -> {
                result = "<h1>THE LICENSE SELECTED IS: A</h1><br>"
                        + "This license has a cost of $34000 and lasts for six months";
            }
            case "License B" -> {
                result = "<h1>THE LICENSE SELECTED IS: B</h1><br>"
                        + "This license has a cost of $47500 and lasts for eight months";
            }
            case "License C" -> {
                result = "<h1>THE LICENSE SELECTED IS: C</h1><br>"
                        + "This license has a cost of $75800 and lasts for twelve months";
            }
            default -> {
                messageError = "Error: this isn't a license";
                result = "<h1>THE LICENSE SELECTED IS: ???</h1><br>" + messageError;
            }
        }
        return result;
    }
}

