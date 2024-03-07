
package com.mycompany.vogalconsoante;

import java.util.Scanner;

public class VogalConsoante {

    public static void main(String[] args) {
        
        Scanner vogais = new Scanner(System.in);
        
        char x;
                 
        System.out.println("Descubra se sua letra é Vogal ou Consoante! Escreva qual sua letra:");
        x = vogais.nextLine().charAt(0);
        
        switch (x) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> System.out.println("Uma vogal!");
            default -> System.out.println("Uma consoante!");
        }
        
        
    }
}
