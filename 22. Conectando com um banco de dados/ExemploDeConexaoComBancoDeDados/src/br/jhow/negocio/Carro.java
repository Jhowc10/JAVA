/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.jhow.negocio;

/**
 *
 * @author tatia
 */
public class Carro {
    
     // Atributos possíveis de um carro para este sistema
    private String fabricante, modelo, cor;
    private int ano, idCarro;
    private double km, valor;
    
    // Set e Gets dos atributos
    public String getfabricante(){
        return fabricante;
    }
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    
    public int getIdCarro(){
        return idCarro;
    }
    
    public void setIdCarro(int idCarro){
        this.idCarro = idCarro;
    }
    
    
    public double getKm(){
        return km;
    }
    
    public void setKm(double km){
        this.km = km;
    }
    
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }   
}
