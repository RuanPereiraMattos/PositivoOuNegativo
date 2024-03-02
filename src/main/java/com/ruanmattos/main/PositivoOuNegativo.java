/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ruanmattos.main;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PositivoOuNegativo {

    /**
     * Programa que verifica se o número digitado pelo usuário é positivo ou negativo
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao programa que irá lhe dizer se o número que você digitar é Positivo ou Negativo");
        System.out.print("Digite o número que deseja verificar: ");
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();
        if(0 <= d){
            System.out.println("O número digitado é positivo");
        }else{
            System.out.println("O número digitado é negativo");
        }
    }
}
