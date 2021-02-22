/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Laize Melo
 */
public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
   
    
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getInstrutor() {
        return instrutor;
    }

    public String getNome() {
        return nome;
    }
    
    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
    
    
    
}
