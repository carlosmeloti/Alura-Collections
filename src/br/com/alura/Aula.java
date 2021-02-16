/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

/**
 *
 * @author Laize Melo
 */
public class Aula implements Comparable<Aula>{
    
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" + "titulo=" + titulo + ", tempo=" + tempo + '}';
    }

    @Override
    public int compareTo(Aula t) {
       return this.titulo.compareTo(t.titulo);
    }
    
    
    
}
