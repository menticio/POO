/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maicol.institution;

/**
 *
 * @author Maicol
 */
public interface Licences {
    String licence();

    default String showLicence() {
        return licence();
    }
}

