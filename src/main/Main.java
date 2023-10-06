/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author A
 */
import controller.DoctorManagement;
import model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        
        new DoctorManagement(user).run();
    }
    
}