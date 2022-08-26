/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author guile
 */
public class Prova {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int valor[] = new int[5];
        int maior = 0, menor = Integer.MAX_VALUE;
        
        for(int i = 0; i < valor.length; i++){
            System.out.println("Digite o " +(i+1)+ " valor: ");
            valor[i] = sc.nextInt();
            if(valor[i] > maior){
                maior = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++){
            if(valor[j] < menor ){
                menor = valor[j];
            }
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor = "+ menor);
    }
    
}
