                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.List;

/**
 *
 * @author Laize Melo
 */
public class TestaCurso {
    
    public static void main(String[] args) {
        
    Curso javaColecoes = new Curso("Dominando Coleções", "Paulo Silveira");
    
    javaColecoes.adiciona(new Aula("Modelagem de objetos", 20));
    javaColecoes.adiciona(new Aula("Modelagem de objetos 2", 20));
    
        System.out.println(javaColecoes.getAulas());
        
        
    }
}
