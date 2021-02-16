/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Laize Melo
 */
public class TestandoListas {
    
    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        

        System.out.println(aulas);
        
        aulas.forEach(a -> {
            System.out.println("Testando Foreach");
            System.out.println(a);
        });
        
        System.out.println("----");
        
        Collections.sort(aulas); // Ordenando por string
        
        for(String s : aulas){
            System.out.println("Testanto outro laço daora");
            System.out.println(s);
        }
        
        System.out.println("----");
        
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Testando o laço veio");
            System.out.println(aulas.get(i));
        }
    }
    
}
