/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author guile
 */
public class prova2 {
    
    public static void main(String[] args) {
      Scanner leitor =  new Scanner(System.in);
      double aumento = 1.5 , salario = 1000, ano = 1995;
     
      do{
        salario = salario + (salario * aumento / 100);
        aumento = aumento * 2;
        ano++;
    }while (ano <= 1997);
      
        System.out.println(salario);
    }    
}
