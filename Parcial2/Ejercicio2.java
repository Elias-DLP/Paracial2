/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.Parcial2;

/**
 *
 * @author elias
 */
import java.util.*;

abstract class Book {
   String title;
   abstract void setTitle(String t);
   String getTitle()
   {
      return title;
   } 
}

class MyBook extends Book {
    
    @Override
    void setTitle(String t){
        this.title = t;
    }  
}

public class Ejercicio2 {
   
   public static void main(String []args) {
      
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      MyBook new_novel=new MyBook();
      new_novel.setTitle(title);
      System.out.println("The title is: "+new_novel.getTitle());
      
   }
}