/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice_task_1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Bird extends Animal{
    int colour;
    
    @Override
    public void input(){
        super.input();
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter Feather Colour:");
       colour = scanner.nextInt();
       
    }
    
    @Override
    public void output(){
        super.output();
        System.out.println("Feather colour " + colour);
    }
    
}
