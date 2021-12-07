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
public class Automovel {
    private Motor motor;
    private Direcao direcao;

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }


   
    
    public void imprimirDadosCarro(){
        System.out.println("Potência do Motor: "+motor.getPotencia());
        System.out.println("'Cor da Direção: "+direcao.getCor());
        
    }
    
    public void Automovel(){ //Metodo Ligar Pela Primeira Vez
        motor = new Motor();
        direcao = new Direcao();
    }
    
    public void LPPV(int potencia, String cor){
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
    }
    
    public Automovel(){
        motor = new Motor();
    }
    public Automovel(int potencia){
        motor = new Motor(potencia);
    }
    
    
}
