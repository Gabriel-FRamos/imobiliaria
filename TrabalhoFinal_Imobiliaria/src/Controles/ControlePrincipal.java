package Controles;

import Limites.LimitePrincipal;

public class ControlePrincipal {
    LimitePrincipal limPrincipal;
    
    public ControlePrincipal(){
        limPrincipal = new LimitePrincipal(this);
    }
    public static void main(String args[]){
        new ControlePrincipal();
    }
}
