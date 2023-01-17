/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Thomás Sousa Causin Alves 201835040
//Iago Mazzoni 202065568c
package ufjf.dcc025.trabalhodcc025parte1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iagom
 */
public class TrabalhoDCC025Parte1 {

    public static void main(String[] args) {
        String senha;
        System.out.println("Escolha a senha do administrador: ");
        Scanner teclado = new Scanner(System.in);
        senha = teclado.nextLine();
        Admin admin = new Admin(senha);
        System.out.println("Escolha a senha do cliente: ");
        senha = teclado.nextLine();
        Cliente cliente = new Cliente(senha);

        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        Produto prod3 = new Produto();
        //Produto prod4 = new Produto();

        admin.NovoProd(prod1);
        admin.NovoProd(prod2);
        admin.NovoProd(prod3);
        //admin.NovoProd(prod4);

        admin.VerProds();

        try {
            admin.RemoveProd();
        } catch (NumProdInvalido ex) {
            Logger.getLogger(TrabalhoDCC025Parte1.class.getName()).log(Level.SEVERE, null, ex);
        }

        admin.VerProds();
        
        try {
            admin.alteraPrecoVenda();
        } catch (NumProdInvalido ex) {
            Logger.getLogger(TrabalhoDCC025Parte1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            admin.alteraPrecoCusto();
        } catch (NumProdInvalido ex) {
            Logger.getLogger(TrabalhoDCC025Parte1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            admin.alteraTamProd();
        } catch (NumProdInvalido ex) {
            Logger.getLogger(TrabalhoDCC025Parte1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        cliente.AdicionaCarrinho(prod3);
        cliente.AdicionaCarrinho(prod2);
        cliente.VerProds();
        cliente.valorTotal();
        try {
            cliente.RemoveDoCarrinho();
        } catch (NumProdInvalido ex) {
            Logger.getLogger(TrabalhoDCC025Parte1.class.getName()).log(Level.SEVERE, null, ex);
        }
        cliente.VerProds();
        cliente.valorTotal();
        cliente.ApagarCarrinho();
        cliente.AdicionaCarrinho(prod1);
        cliente.VerProds();
        cliente.valorTotal();
        
    }
}
