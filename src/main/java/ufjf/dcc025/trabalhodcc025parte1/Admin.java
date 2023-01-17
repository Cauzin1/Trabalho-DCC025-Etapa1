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
 * @author Cauzin
 */

public class Admin extends User {

    public Admin(String senha) {
        super(senha);
    }

    public void alteraTamProd() throws NumProdInvalido{

        System.out.println("Para alterar o tamanho do produto ");
        validaSenha();
        System.out.println("Digite o numero do produto");
        Scanner teclado = new Scanner(System.in);
        int numProd = teclado.nextInt();
        if (numProd < 1 || numProd > qntdProd) {
            throw new NumProdInvalido();
        } else {
            System.out.println("Digite o novo tamanho:  ");
            String tam = teclado.nextLine();

            int i = 1;
            for (Produto produto : produtos) {
                if (i == numProd) {
                    try {
                        validaTamProd(tam, produto);
                    } catch (TamanhoInvalido ex) {
                        Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                i++;
            }
        }

    }

    private void validaTamProd(String tam, Produto produto) throws TamanhoInvalido {
        if (tam.equals("p") || tam.equals("P") || tam.equals("m")
                || tam.equals("M") || tam.equals("g") || tam.equals("G")) {
            produto.setTamProd(tam);
            System.out.println(" Tamanho do produto alterado! ");
        }

        {
            throw new TamanhoInvalido();
            //System.out.println(" tamanho Invalido !");
            //System.out.println(" Digite o tamanho do produto novamente: ");
            //String novotam = teclado.nextLine();
            //setTamProd(novotam);
        }
    }

    @Override
    public void InfosProd(Produto produto) {
        System.out.println("Nome : " + produto.getNomeProd() + ".");
        System.out.println("Remessa : " + produto.getRemessaProd() + ".");
        System.out.println("Tamanho : " + produto.getTamProd() + ".");
        System.out.println("Preco de venda : " + produto.getPrecoVenda() + ".");
        System.out.println("Preco de custo : " + produto.getPrecoCusto() + ".");
        System.out.println("Lucro : " + produto.getLucro() + ".");
    }

    public void alteraPrecoVenda() throws NumProdInvalido {
        System.out.println("Para alterar o preco de venda do produto ");
        validaSenha();
        System.out.println("Digite o numero do produto:  ");
        Scanner teclado = new Scanner(System.in);
        int numProd = teclado.nextInt();
        if (numProd < 1 || numProd > qntdProd) {
            throw new NumProdInvalido();
        } else {
            System.out.println("Digite o novo preco:  ");
            int novoValor = teclado.nextInt();
            int i = 1;
            for (Produto produto : produtos) {
                if (i == numProd) {
                    produto.setPrecoVenda(novoValor);
                }
                i++;
            }
        }
    }

    public void alteraPrecoCusto() throws NumProdInvalido {
        System.out.println("Para alterar o preco de custo do produto ");
        validaSenha();
        System.out.println("Digite o numero do produto:  ");
        Scanner teclado = new Scanner(System.in);
        int numProd = teclado.nextInt();
        if (numProd < 1 || numProd > qntdProd) {
            throw new NumProdInvalido();
        } else {
            System.out.println("Digite o novo preco:  ");
            int novoValor = teclado.nextInt();
            int i = 1;
            for (Produto produto : produtos) {
                if (i == numProd) {
                    produto.setPrecoCusto(novoValor);
                }
                i++;
            }
        }
    }

    List<Produto> produtos = new ArrayList<>();

    private int qntdProd = 0;

    public void NovoProd(Produto produto) {

        System.out.println("Para criar o produto ");

        validaSenha();

        Scanner teclado = new Scanner(System.in);
        String nome;
        int custo;
        int venda;
        String tam;
        String remessa;

        System.out.println("Nome : ");
        nome = teclado.nextLine();

        System.out.println("Remessa : ");
        remessa = teclado.nextLine();

        System.out.println("Tamanho : ");
        tam = teclado.nextLine();

        System.out.println("Preco de venda : ");
        venda = teclado.nextInt();

        System.out.println("Preco de custo : ");
        custo = teclado.nextInt();

        produto.ProdutoNovo(nome, custo, venda, tam, remessa);

        produtos.add(produto);
        qntdProd++;
    }

    public void VerProds() {

        int i = 1;
        for (Produto produto : produtos) {
            System.out.println("Produto numero : " + i);
            InfosProd(produto);
            i++;
        }
    }

    public void RemoveProd() throws NumProdInvalido {

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

}
