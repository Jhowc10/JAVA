/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uninove.poo.sa.negocio;

/**
 *
 * @author tatia
 */
public class Aluno extends Pessoa{
    private String curso;
    private float notaVestibular;
    private long registroAcademico;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNotaVestibular() {
        return notaVestibular;
    }

    public void setNotaVestibular(float notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public long getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(long registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
}
