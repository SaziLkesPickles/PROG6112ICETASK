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
public class Animal {
int IDtag;
String species;

public void input(){
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter ID Tag: ");
 IDtag = scanner.nextInt();
 System.out.print("Enter species: ");
 species = scanner.next();
 
}

public void output(){
    System.out.println("ID Tag is: " +IDtag);
    System.out.println("Species is:" +species);
}

}
