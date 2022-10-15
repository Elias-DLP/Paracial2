/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Parcial2;

/**
 *
 * @author elias
 */
class Animal{
   void walk()
   {
      System.out.println("I am walking");
   }
}

class Bird extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
   }
    void sing()
   {
      System.out.println("I am singing");
   }
}
public class Ejercicio4{


   public static void main(String args[])
   {

     Bird bird = new Bird();
     bird.walk();
     bird.fly();
     bird.sing();
   
   }
}