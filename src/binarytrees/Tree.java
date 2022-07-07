package binarytrees;

import javax.swing.JOptionPane;

public class Tree {

    Nodo punta;

    //Constructor
    public Tree() {
        punta = null;
    }

    public void create (char[] vc){               
        int i =0;
        while (i < vc.length) {
            Nodo x = new Nodo();
            x.setDato(vc[i]);
            if (punta == null) {
                punta = x;
            } else {
                Nodo p = punta;
                Nodo ant = null;
                while (p != null) {       
                    ant = p;
                    if (vc[i] > p.getDato()) {
                        p = p.getLd();
                    } else {
                        p = p.getLi();
                    }
                }
                if (vc[i] > ant.getDato()) {
                    ant.setLd(x);
                } else {
                    ant.setLi(x);
                }
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, "Arbol creado con exito!!");
    }
    
     
    public void inorden(Nodo x) {
        if (x != null) {
            inorden(x.getLi());   
            System.out.println(x.getDato());
            inorden(x.getLd());
        } 
    }

    public void preorden(Nodo x) {
        if (x != null) {
            System.out.println(x.getDato());
            inorden(x.getLi());
            inorden(x.getLd());
            
        }
    }

    public void posorden(Nodo x) {
        if (x != null) {
            inorden(x.getLi());
            inorden(x.getLd());
            System.out.println(x.getDato());
        }
            
    }

    public void contarHojas() {

    }

    public void contarPadres() {

    }
    
    public void mostrarRegistrohijo(){
        
    }
    
    public void mostrarHermanoDato(){
        
    }
    
    public void nivelDato(){
        
    }
    
    public void alturaDato(){
        
    }

}
