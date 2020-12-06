/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_crm_desk;

/**
 *
 * @author kevin
 */
public class agente {
    
    String name;
    String operator;
    int id;
    boolean booking;
    boolean sales;

    agente(String op, boolean book, boolean sale){
        operator=op;
        booking=book;
        sales=sale;
    }
  
}
