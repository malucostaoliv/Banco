/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Banco {
    public static void main(String[] args){
    
    Fisica p1 = new Fisica(75, "Maria", 0);
    Juridico p2 = new Juridico(733, "Fernando", 0);
    
    p1.depositar();
    p2.depositar();
    
    p1.depositar();
    p2.depositar();
    
    p1.depositar();
    p2.depositar();
    
    p1.sacar();
    p2.sacar();
    
    System.out.println("Titular da conta: " + p1.titular);
    System.out.println("Cpf do titular da conta: " + p1.cpf);
    System.out.println("Saldo do titular da conta: " + p1.saldo);
    
    System.out.println("Titular da conta: " + p2.titular);
    System.out.println("Cpf do titular da conta: " + p2.cnpj);
    System.out.println("Saldo do titular da conta: " + p2.saldo);
    }
    
    
    
    
    
}
