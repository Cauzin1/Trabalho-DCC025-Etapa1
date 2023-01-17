/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufjf.dcc025.trabalhodcc025parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iagom
 */
public class Cliente extends User {

    public Cliente(String senha) {
        super(senha);
    }
    private int qntdProd = 0;

    @Override
    public void InfosProd(Produto produto) {
        System.out.println("Nome : " + produto.getNomeProd() + ".");
        System.out.println("Tamanho : " + produto.getTamProd() + ".");
        System.out.println("Preco : " + produto.getPrecoVenda() + ".");
    }

    List<Produto> produtos = new ArrayList<>();

     void AdicionaCarrinho(Produto produto) {

        System.out.println("Para adicionar o produto ");

        validaSenha();

        produtos.add(produto);
        qntdProd++;
    }

    public void ApagarCarrinho() {
        System.out.println("Para apagar o carrinho ");

        validaSenha();

        produtos.clear();
        System.out.println("Carrinho apagado! ");
        qntdProd = 0;
    }

    public void RemoveDoCarrinho() throws NumProdInvalido {

        System.out.println("Para remover o produto ");

        validaSenha();

        Scanner teclado = new Scanner(System.in);
        int i = teclado.nextInt();
        if (i < 1 || i > qntdProd) {
            throw new NumProdInvalido();
        } else {
            produtos.remove(i);
            System.out.println("Produto Removido");
            qntdProd--;
        }

    }

    public void VerProds() {

        int i = 1;
        for (Produto produto : produtos) {
            System.out.println("Produto numero : " + i);
            InfosProd(produto);
            i++;
        }
    }

    public void valorTotal() {
        int i = 0;
        for (Produto produto : produtos) {
            i = +produto.getPrecoVenda();
        }
        System.out.println("Total : R$ " + i);
    }
}
