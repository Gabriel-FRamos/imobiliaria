package Entidades.Corretor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Contratado extends Corretor implements Serializable{
    private float porcentagem;
    private double salario;
    private Date dataAdmissao;
    
    private Contratado(String pNome, int pCod, double pSalario, Date dataAdm){
        super(pNome, pCod);
        porcentagem = 1;
        salario = pSalario;
        dataAdmissao = dataAdm;        
    }
    public float getPorcentagem(){
        return porcentagem;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double pSalario){
        salario = pSalario;
    }
    public Date getDataAdmissao(){
        return dataAdmissao;
    }
    public void setDataAdmissao(Date pData){
        dataAdmissao = pData;
    }

    @Override
    public double calculaSalario(Date pMes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
