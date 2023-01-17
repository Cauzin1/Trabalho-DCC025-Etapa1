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
 * @author Cauzin
 */
public abstract class User implements Infos{

    private String senha;

    public User( String senha) {    
        this.senha = senha;
    }
    
    public void setSenha(String senha) {
  
            validaSenha();
        this.senha = senha;
    }

    public void validaSenha() {
        System.out.println("Digite a Senha : ");
        Scanner teclado = new Scanner(System.in);
        String senhaDigitada = teclado.nextLine();
        senhaDigitada = senhaDigitada.toLowerCase();
        this.senha = this.senha.toLowerCase();
        System.out.println(senha +" = " + senhaDigitada);
        if(this.senha.equals(senhaDigitada)){
            System.out.println("Senha valida !");
        }
        else{
            System.out.println("Senha incorreta !");
            validaSenha();
        }
    }    

}
