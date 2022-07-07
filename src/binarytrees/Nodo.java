package binarytrees;


public class Nodo {
    
    private char Dato;
    private Nodo Ld, Li;

    //Constructor
    public Nodo(char Dato, Nodo Ld, Nodo Li) {
        this.Dato = Dato;
        Ld = null;
        Li = null;
    }
    
    public Nodo(){
        
    }

    public char getDato() {
        return Dato;
    }

    public void setDato(char Dato) {
        this.Dato = Dato;
    }

    public Nodo getLd() {
        return Ld;
    }

    public void setLd(Nodo Ld) {
        this.Ld = Ld;
    }

    public Nodo getLi() {
        return Li;
    }

    public void setLi(Nodo Li) {
        this.Li = Li;
    }
        

}