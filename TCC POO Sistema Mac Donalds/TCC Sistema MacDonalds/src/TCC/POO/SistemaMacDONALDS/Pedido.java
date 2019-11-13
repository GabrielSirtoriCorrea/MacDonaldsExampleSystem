/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCC.POO.SistemaMacDONALDS;

/**
 *
 * @author Gazebo
 */
public class Pedido {
    private Lanche lanche;
    private String cliente;
    private int preco;
        
    public Pedido(Lanche lanche, String cliente, int preco) {
        this.lanche = lanche;
        this.cliente = cliente;
        this.preco = preco;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void FazerPedido(){
        System.out.println("O Pedido foi feito com sucesso");
        System.out.println("Lanche: " + lanche.getLanche());
        System.out.println("Cliente: " + getCliente());
        System.out.println("Total a Pagar: R$" + getPreco());
    }
}
