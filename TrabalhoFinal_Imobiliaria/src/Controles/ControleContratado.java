package Controles;

import Entidades.Corretor.Comissionado;
import Entidades.Corretor.Contratado;
import Limites.LimiteContratado;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleContratado {
    LimiteContratado limContratado;
    private ArrayList <Contratado> listaCorretoresContratados = new ArrayList();
    
    public ControleContratado(){
        recuperaContratado();
        limContratado = new LimiteContratado(this);
    }
    public void serializaContratado(){
        try{   
            FileOutputStream objFileOS = new FileOutputStream("contratados.dat");
            ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
            objOS.writeObject(listaCorretoresContratados);
            objOS.flush();
            objOS.close();
        }catch(Exception e){
            System.out.println("Problema de arquivo escrita");
        }  
    }
   public void recuperaContratado(){
        try{
            File objFile = new File("contratados.dat");
            if (objFile.exists()) {
                FileInputStream objFileIS = new FileInputStream("contratados.dat");
                ObjectInputStream objIS = new ObjectInputStream(objFileIS);
                listaCorretoresContratados = (ArrayList<Contratado>) objIS.readObject();            
                objIS.close();
            }    
        }catch(Exception e){
            System.out.println("Problema de arquivo recuperar");
            System.out.println(e.getMessage());
        }
    }
}
