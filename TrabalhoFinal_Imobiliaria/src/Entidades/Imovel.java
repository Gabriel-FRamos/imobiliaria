package Entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Imovel implements Serializable{
    private int codigo;
    private String tipo;
    private String descrição;
    private String nomeVendedor;
    private double preçoSolicitado;
    private String dataCadastro; 
    
    public Imovel(int pCodigo, String pTipo, String pDesc, String pNome, double pPreço, String pData){
        codigo = pCodigo;
        tipo = pTipo;
        descrição = pDesc;
        nomeVendedor = pNome;
        preçoSolicitado = pPreço;
        dataCadastro = pData;
    }
    public int getCodigoImovel(){
        return codigo;
    }
    public String getTipoImovel(){
        return tipo;
    }
    public String getDescriçãoImovel(){
        return descrição;
    }
    public String getNomeVendedor(){
        return nomeVendedor;
    }
    public double getPreçoSolicitado(){
        return preçoSolicitado;
    }
    public String getDataCadastro(){
        return dataCadastro;
    }
    public void setDescriçãoImovel(String pDes){
        descrição = pDes;
    }
    public void setNomeVendedor(String pNome){
        nomeVendedor = pNome;
    }
    public void setPreçoImovel(double pPreço){
        preçoSolicitado = pPreço;
    }
    public void setDataCadastro(String pData){
        dataCadastro = pData;
    }
}
