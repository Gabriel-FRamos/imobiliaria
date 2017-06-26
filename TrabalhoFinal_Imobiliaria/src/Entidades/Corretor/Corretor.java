package Entidades.Corretor;

import java.util.ArrayList;
import java.util.Date;

public abstract  class Corretor {
    private String nome;
    private int CRECI;
    
    public Corretor(String pNome, int pCreci){
        nome = pNome;
        CRECI = pCreci;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String pNome){
        nome = pNome;
    }
    public int getCRECI(){
        return CRECI;
    }
    public void setCRECI(int pCreci){
        CRECI = pCreci;
    }
    public abstract double calculaSalario(Date pMes);
}
