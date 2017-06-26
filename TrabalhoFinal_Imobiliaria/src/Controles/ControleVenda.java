package Controles;

import Entidades.Corretor.Contratado;
import Entidades.Venda;
import Limites.LimiteVenda;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleVenda{
    LimiteVenda limVenda;
    private ArrayList <Venda> imoveisVendidos = new ArrayList();
    
    public ControleVenda(){
        recuperaVenda();
        limVenda = new LimiteVenda(this);
    }
    public void serializaVenda(){
        try{   
            FileOutputStream objFileOS = new FileOutputStream("vendas.dat");
            ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
            objOS.writeObject(imoveisVendidos);
            objOS.flush();
            objOS.close();
        }catch(Exception e){
            System.out.println("Problema de arquivo escrita");
        }  
    }
   public void recuperaVenda(){
        try{
            File objFile = new File("vendas.dat");
            if (objFile.exists()) {
                FileInputStream objFileIS = new FileInputStream("vendas.dat");
                ObjectInputStream objIS = new ObjectInputStream(objFileIS);
                imoveisVendidos = (ArrayList<Venda>) objIS.readObject();            
                objIS.close();
            }    
        }catch(Exception e){
            System.out.println("Problema de arquivo recuperar");
            System.out.println(e.getMessage());
        }
    }
    
}
