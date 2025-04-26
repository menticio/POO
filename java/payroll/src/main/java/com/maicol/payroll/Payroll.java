/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maicol.payroll;

/**
 *
 * @author Maicol
 */
public class Payroll{
    public static void main(String[] args) {
        Coach coach = new Coach(7, 100000);
        coach.show();

        Supervisor supervisor = new Supervisor(coach, 60000);
        supervisor.show();

        Administrator admin = new Administrator();
        admin.show();
    }
}
