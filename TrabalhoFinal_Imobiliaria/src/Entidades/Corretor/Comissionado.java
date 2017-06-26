package Entidades.Corretor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Comissionado extends Corretor implements Serializable{
    private float comissao;
    
    private Comissionado(String pNome, int pCod,float pComissao){
        super(pNome, pCod);
        comissao = pComissao;       
    }
    public float getComissao(){
        return comissao;
    }
    public void setComissao(float pComissao){
        comissao = pComissao;
    }

    @Override
    public double calculaSalario(Date pMes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
