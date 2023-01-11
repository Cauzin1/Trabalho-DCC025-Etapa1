package ufjf.dcc025.trabalhodcc025parte1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Thomás Sousa Causin Alves 201835040
//Iago Mazzoni 202065568c
//https://github.com/Cauzin1/Trabalho-DCC025-Etapa1.git


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author iagom
 */
public class TrabalhoDCC025Parte1 extends JFrame implements ActionListener{
    

    
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
       
        JLabel adminLabel = new JLabel("Admin");
        adminLabel.setBounds(10,20,80,25);
        panel.add(adminLabel);
        
        JTextField adminText = new JTextField(20);
        adminText.setBounds(100,20,165,25);
        panel.add(adminText);
        
        JLabel senha = new JLabel("Senha");
        senha.setBounds(10,50,80,25);
        panel.add(senha);
        
        JPasswordField senhaText = new JPasswordField();
        senhaText.setBounds(100,50,165,25);
        panel.add(senhaText);
        
        JButton button = new JButton("Entrar");
        button.setBounds(10,80,80,25);
        panel.add(button);
        button.addActionListener(this);
        
        JLabel entrou = new JLabel("");
        entrou.setBounds(10,110,300,25);
        panel.add(entrou);

        
        frame.setVisible(true);
      */
        
        /*
        JLabel remessaLabel = new JLabel("Remessa :");
        remessaLabel.setBounds(10,20,80,25);
        panel.add(remessaLabel);
        JTextField remessaText = new JTextField(20);
        remessaText.setBounds(100,20,165,25);
        panel.add(remessaText);
        String remessa = remessaText.getText();
        prod1.setRemessaProd(remessa);
        
        
       JLabel nomeProdutoLabel = new JLabel("Nome do produto :");
        nomeProdutoLabel.setBounds(10,50,80,25);
        panel.add(nomeProdutoLabel);
        JTextField nomeProdutoText = new JTextField(20);
        nomeProdutoText.setBounds(100,50,165,25);
        panel.add(nomeProdutoText);
        String nome = nomeProdutoText.getText();
        prod1.setNomeProd(nome);
        
        JLabel tamLabel = new JLabel("Tamanho do produto :");
        tamLabel.setBounds(10,80,80,25);
        panel.add(tamLabel);
        JTextField tamText = new JTextField(20);
        tamText.setBounds(100,80,165,25);
        panel.add(tamText);
        String tam = tamText.getText();
        prod1.setTamProd(tam);
        
        JLabel custoLabel = new JLabel("Custo do produto :");
        custoLabel.setBounds(10,110,80,25);
        panel.add(custoLabel);
        JTextField custoText = new JTextField(20);
        custoText.setBounds(100,110,165,25);
        panel.add(custoText);
        String custo = custoText.getText();
        int custofinal = Integer.parseInt(custo);
        prod1.setPrecoCusto(custofinal);
        
        JLabel vendaLabel = new JLabel("Custo de venda :");
        vendaLabel.setBounds(10,140,80,25);
        panel.add(vendaLabel);
        JTextField vendaText = new JTextField(20);
        vendaText.setBounds(100,140,165,25);
        panel.add(vendaText);
        String venda = vendaText.getText();
        int vendafinal = Integer.parseInt(venda);
        prod1.setPrecoVenda(vendafinal);
*/
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

    @Override
    public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null,"Deu certo");
    }
}
