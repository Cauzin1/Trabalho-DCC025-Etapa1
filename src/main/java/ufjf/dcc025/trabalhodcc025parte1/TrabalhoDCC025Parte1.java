/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Thomás Sousa Causin Alves 201835040
//Iago Mazzoni 202065568c

package ufjf.dcc025.trabalhodcc025parte1;

import java.util.Scanner;
/**
 *
 * @author iagom
 */
public class TrabalhoDCC025Parte1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        Produto prod3 = new Produto();
        
        System.out.println(" Digite a remessa do produto: ");
        String remessa = teclado.nextLine();
        prod1.setRemessaProd(remessa);
        
        System.out.println(" Digite o nome do produto: ");
        String nome = teclado.nextLine();
        prod1.setNomeProd(nome);
        
        System.out.println(" Digite o tamanho do produto: ");
        String tam = teclado.nextLine();
        prod1.setTamProd(tam);
        
        System.out.println(" Digite o preco de custo do produto: ");
        int custo = teclado.nextInt();
        prod1.setPrecoCusto(custo);
        
        System.out.println(" Digite preco de venda do produto: ");
        int venda = teclado.nextInt();
        prod1.setPrecoVenda(venda);
        
        
        
//        System.out.println(" Digite o nome do produto: ");
//        String nome2 = teclado.nextLine();
//        prod2.setNomeProd(nome2);
//        System.out.println(" Digite o tamanho do produto: ");
//        String tam2 = teclado.next();
//        prod2.setTamProd(tam2);
//        System.out.println(" Digite o preco de custo do produto: ");
//        int custo2 = teclado.nextInt();
//        prod2.setPrecoCusto(custo2);
//        System.out.println(" Digite preco de venda do produto: ");
//        int venda2 = teclado.nextInt();
//        prod2.setPrecoVenda(venda2);
//        System.out.println(" Digite a remessa do produto: ");
//        String remessa2 = teclado.nextLine();
//        prod2.setRemessaProd(remessa2);
//        
//        System.out.println(" Digite o nome do produto: ");
//        String nome3 = teclado.nextLine();
//        prod3.setNomeProd(nome3);
//        System.out.println(" Digite o tamanho do produto: ");
//        String tam3 = teclado.next();
//        prod3.setTamProd(tam3);
//        System.out.println(" Digite o preco de custo do produto: ");
//        int custo3 = teclado.nextInt();
//        prod3.setPrecoCusto(custo3);
//        System.out.println(" Digite preco de venda do produto: ");
//        int venda3 = teclado.nextInt();
//        prod3.setPrecoVenda(venda3);
//        System.out.println(" Digite a remessa do produto: ");
//        String remessa3 = teclado.nextLine();
//        prod3.setRemessaProd(remessa3);
        
        System.out.println(prod1.getNomeProd());
        System.out.println(prod1.getPrecoCusto());
        System.out.println(prod1.getPrecoVenda());
        System.out.println(prod1.getTamProd());
        System.out.println(prod1.getRemessaProd());
//        System.out.println(prod2.getNomeProd());
//        System.out.println(prod3.getNomeProd());
    }
}
