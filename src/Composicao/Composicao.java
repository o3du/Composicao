/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composicao;

/**
 *
 * @author IFSC
 */
public class Composicao {
    public static void main(String[] args){
        //Primeira forma
        Automovel uno = new Automovel();
        Automovel Golf = new Automovel(2000);
        
        //Segunda forma
        Automovel carro = new Automovel();
        carro.LPPV();
        carro.LPPV(1600);
        
        //Terceira forma
        Automovel moto = new Automovel();
        Motor motor = new Motor();
        Motor motor2 = new Motor(1600);
        
    }
}
