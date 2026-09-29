/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Conta {
    
    String titular;
    int saldo;
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public int getSaldo(){
        return saldo;
    } 
    
     public void setSaldo(int saldo){
        this.saldo = saldo;
    }
     
     public Conta(String titular, int saldo){
         this.titular = titular;
         this.saldo = 0;
     }
     
     public void depositar(){}
     public void sacar(){}
}
