package Controles;

import Entidades.Corretor.Corretor;
import Entidades.Corretor.*;
import Limites.LimiteComissionado;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleComissionado {
    LimiteComissionado limComissionado;
    private ArrayList <Comissionado> listaCorretoresComissionados = new ArrayList();
    
    public ControleComissionado(){
        recuperaComissionado();
        limComissionado = new LimiteComissionado(this);
    }
    public void serializaComissionado(){
        try{   
            FileOutputStream objFileOS = new FileOutputStream("comissionados.dat");
            ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
            objOS.writeObject(listaCorretoresComissionados);
            objOS.flush();
            objOS.close();
        }catch(Exception e){
            System.out.println("Problema de arquivo escrita");
        }  
    }
   public void recuperaComissionado(){
        try{
            File objFile = new File("comissionados.dat");
            if (objFile.exists()) {
                FileInputStream objFileIS = new FileInputStream("comissionados.dat");
                ObjectInputStream objIS = new ObjectInputStream(objFileIS);
                listaCorretoresComissionados = (ArrayList<Comissionado>) objIS.readObject();            
                objIS.close();
            }    
        }catch(Exception e){
            System.out.println("Problema de arquivo recuperar");
            System.out.println(e.getMessage());
        }
    }
}
