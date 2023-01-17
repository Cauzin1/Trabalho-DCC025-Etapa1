/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhodcc025parte1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iagom
 */
public class Produto {

    Scanner teclado = new Scanner(System.in);
    
    private String nomeProd;
    private int precoCusto;
    private int precoVenda;
    private String tamProd;
    private String remessaProd;

    public void ProdutoNovo(String nomeProd, int precoCusto, int precoVenda, String tamProd, String remessaProd) {
        this.nomeProd = nomeProd;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.tamProd = tamProd;
        this.remessaProd = remessaProd;
    }
    private int lucro = precoVenda - precoCusto;
 
    
    
    public int getPrecoCusto(){return this.precoCusto;}
    public int getPrecoVenda(){return this.precoVenda;}
    public String getNomeProd(){return this.nomeProd;}
    public String getRemessaProd(){return this.remessaProd;}
    public String getTamProd(){return this.tamProd;}
    public int getLucro() {return lucro;}
    

    public void setPrecoCusto(int val){
        this.precoCusto = val ;
        System.out.println(" Preco de custo alterado! ");
    }
    public void setPrecoVenda(int val){
        this.precoVenda = val ;
        System.out.println(" Preco de venda alterado! ");
    }
    public void setNomeProd(String nome){
        this.nomeProd = nome;
        System.out.println(" Nome do produto alterado! ");
    }
    public void setRemessaProd(String remessa){
        this.remessaProd = remessa;
        System.out.println(" Remessa do produto alterado! ");
    }
    public void setTamProd(String tamProd) {
        this.tamProd = tamProd;
    }

   
}
