package Entidades;

import Entidades.Corretor.Corretor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Venda implements Serializable{
    private double valorVenda;
    private String nomeComprador;
    private Date dataVenda;
    private Corretor vendedor;
    
    public Venda(double pValor, String pNome, Date pData, Corretor pVend){
        valorVenda = pValor;
        nomeComprador = pNome;
        dataVenda = pData;
        vendedor = pVend;
    }
    public double getValorVenda(){
        return valorVenda;
    }
    public String getNomeComprador(){
        return nomeComprador;
    }
    public Date getDataVenda(){
        return dataVenda;
    }
    public Corretor getVendedor(){
        return vendedor;
    }
}
