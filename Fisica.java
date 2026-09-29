/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Fisica extends Conta {
    int cpf;
    
    public int getCpf(){
        return cpf;
    } 
    
     public void setCpf(int cpf){
        this.cpf = cpf;
    }
     
     public Fisica(int cpf, String titular, int saldo){
         super(titular, saldo);
         this.cpf = cpf;
     }
     
    @Override
     public void depositar(){
     this.saldo = saldo + 10;
     }
     
    @Override
     public void sacar(){
     this.saldo = saldo - 10;
     }
     
}
