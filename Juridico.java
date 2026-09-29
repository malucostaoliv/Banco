/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Juridico extends Conta {
     int cnpj;
    
    public int getCnpj(){
        return cnpj;
    } 
    
     public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
     
     public Juridico(int cnpj, String titular, int saldo){
         super(titular, saldo);
         this.cnpj = cnpj;
     }
    
     @Override
     public void depositar(){
     this.saldo = saldo + 1000;
     }
     
     @Override
     public void sacar(){
     this.saldo = saldo - 1000;
     }
}
