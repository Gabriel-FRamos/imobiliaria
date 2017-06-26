package Controles;

import Entidades.Corretor.Contratado;
import Entidades.Imovel;
import Limites.LimiteImovel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleImovel {
    LimiteImovel limImovel;
    private ArrayList <Imovel> listaImoveis = new ArrayList();
    
    public ControleImovel(){
        recuperaImovel();
        limImovel = new LimiteImovel(this);
    }
    public void serializaImovel(){
        try{   
            FileOutputStream objFileOS = new FileOutputStream("imoveis.dat");
            ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
            objOS.writeObject(listaImoveis);
            objOS.flush();
            objOS.close();
        }catch(Exception e){
            System.out.println("Problema de arquivo escrita");
        }  
    }
   public void recuperaImovel(){
        try{
            File objFile = new File("imoveis.dat");
            if (objFile.exists()) {
                FileInputStream objFileIS = new FileInputStream("imoveis.dat");
                ObjectInputStream objIS = new ObjectInputStream(objFileIS);
                listaImoveis = (ArrayList<Imovel>) objIS.readObject();            
                objIS.close();
            }    
        }catch(Exception e){
            System.out.println("Problema de arquivo recuperar");
            System.out.println(e.getMessage());
        }
    }
}
