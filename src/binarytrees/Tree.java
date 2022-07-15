package binarytrees;

import javax.swing.JOptionPane;

public class Tree {

    Nodo punta;
    private int cant;
    private String msjInorden = "";
    private String msjPreorden = "";
    private String msjPosorden = "";

    //Constructor
    public Tree() {
        punta = null;
    }

    public void create(char[] vc) {
        int i = 0;
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

    public String inorden(Nodo x) {
        if (x != null) {
            inorden(x.getLi());
            System.out.println(x.getDato());
            msjInorden = msjInorden + x.getDato();
            inorden(x.getLd());
        }
        return msjInorden;
    }

    public String preorden(Nodo x) {
        if (x != null) {
            System.out.println(x.getDato());
            msjPreorden = msjPreorden + x.getDato();
            preorden(x.getLi());
            preorden(x.getLd());
        }
        return msjPreorden;
    }

    public String posorden(Nodo x) {
        if (x != null) {
            posorden(x.getLi());
            posorden(x.getLd());
            System.out.println(x.getDato());
            msjPosorden = msjPosorden + x.getDato();
        }
        return msjPosorden;

    }

    public int contarHojas(Nodo x) {
        if (x != null) {
            if (x.getLi() == null && x.getLd() == null) {
                cant++;
            }
            contarHojas(x.getLi());
            contarHojas(x.getLd());
        }
        return cant;
    }

    public int contarPadres(Nodo x) {
        if (x != null) {
            if (x.getLi() != null || x.getLd() != null) {
                cant++;
            }
            contarPadres(x.getLi());
            contarPadres(x.getLd());
        }
        return cant;
    }

    //Mostrar registros de un solo hijo
    public void mostrarRegistrohijo(Nodo x) {
        if (x != null) {
            if ((x.getLi() != null && x.getLd() == null) || (x.getLi() == null && x.getLd() != null)) {
                System.out.println(x.getDato());
            }
            mostrarRegistrohijo(x.getLi());
            mostrarRegistrohijo(x.getLd());
        }
    }

    //MOSTRAR POR JOPTION
    public void mostrarHermanoDato(Nodo padre, Nodo x, char dato) {

        if (x != null) {

            if ((x.getDato() == dato) && padre != null) {
                if (x.getDato() > padre.getDato()) {
                    JOptionPane.showMessageDialog(null, "El Hermano de " + x.getDato() + " es " + padre.getLi().getDato());
                    //System.out.println(padre.getLi().getDato());                                        
                } else {
                    //System.out.println(padre.getLd().getDato());                    
                    JOptionPane.showMessageDialog(null, "El Hermano de " + x.getDato() + " es " + padre.getLd().getDato());
                }
            }

            if (dato > x.getDato()) {
                mostrarHermanoDato(x, x.getLd(), dato);
            } else {
                mostrarHermanoDato(x, x.getLi(), dato);
            }
        }
    }

    public int nivelDato(Nodo x, char dato) {
        int n = 0;
        if (x != null) {
            while (x.getDato() != dato) {
                n++;
                if (dato > x.getDato()) {
                    x = x.getLd();
                } else {
                    x = x.getLi();
                }
            }

            if (x.getDato() == dato) {
                n++;
                // JOptionPane.showMessageDialog(null, "El nivel de " + x.getDato() + " es: " + n);
            } else {
                JOptionPane.showMessageDialog(null, "El Dato no se encuentra");
            }
        }
        return n;
    }

    public void alturaDato(Nodo x, char dato) {
        int izq = 0, der = 0, altura = 0;
        Nodo aux;
        if (x != null) {
            if (x.getDato() == dato) {
                aux = x;
                while (aux != null) {
                    izq++;
                    aux = aux.getLi();
                }

                aux = x;
                while (aux != null) {
                    der++;
                    aux = x.getLd();
                }

                if (izq >= der) {
                    altura = izq;
                    JOptionPane.showMessageDialog(null, "La altura del dato es: " + altura);
                } else {
                    altura = der;
                    JOptionPane.showMessageDialog(null, "La altura del dato es: " + altura);
                }
            }

            if (dato > x.getDato()) {
                alturaDato(x.getLd(), dato);
            } else {
                alturaDato(x.getLi(), dato);
            }
        }
    }

    //Mostrar los primos de un dato ingresado
    public void primos(Nodo x, char dato) {
        if (x != null) {

            int level = nivelDato(x, dato);

            if (level == 1) {
                JOptionPane.showMessageDialog(null, "No tiene primos");
            } else {

            }

        }
    }

//    if (!(root.left != null && root.left == node || root.right != null && root.right == node))
//        {
//            printLevel(root.left, node, level - 1);
//            printLevel(root.right, node, level - 1);
    
    
//Mostrar los ancetros de un dato ingresado
    public void ancestros() {

    }
}
