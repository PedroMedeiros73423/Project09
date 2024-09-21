

package com.mycompany.project09;
import java.util.Scanner;
public class Project09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o seu peso: ");
        int peso = in.nextInt();
        System.out.println("Informe a sua altura: ");
        Double altura = in.nextDouble();
        Double IMC = peso / (altura * altura );
        System.out.println("IMC: " + IMC);
               
    }
}
