/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Parcial2;

/**
 *
 * @author elias
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Arithmetic {
    public int add(int No1, int No2) {
    
        return No1 + No2;
    }
} 

class Adder extends Arithmetic {
    
}

public class Ejercicio3{
    public static void main(String []args){
        Adder a = new Adder();
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());    
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}