package binarytrees;

import javax.swing.JOptionPane;

public class BinaryTrees {

    public static void main(String[] args) {
        // Menu en algun sitio pedir un String al usuario y llamar método de crear
        //Separadas los string, letras por comas y cualquier otro caracter //Separar con Split(), ToCharArray, ToString
        //Si hay una letra repetida no tomarla en cuenta ( Validación al ingresar string ) Convertir todo a minusculas o mayusculas (Consultar método) 
        // convertir a char y ahi se puede utilizar tochararray para compararlos entre mayor y menor

        menuppal();
    }

    public static void menuppal() {
        int opcion = 0;
        String data = JOptionPane.showInputDialog("Ingrese un String para generar el árbol Binario: ");
        char[] dataCh = data.toCharArray();
        Tree tree = new Tree();
        tree.create(dataCh);
        String menu = "***MAIN MENU BINARY TREES***\n"
                + "1- Mostrar árbol\n"
                + "2- Mostrar recorrido inorden\n"
                + "3- Mostrar recorrido preorden\n"
                + "4- Mostrar recorrido posorden\n"
                + "5- Cantidad de hojas\n"
                + "6- Cantidad de padres\n"
                + "7- Mostrar registros de un solo hijo\n"
                + "8- Mostrar hermano de un dato ingresado\n"
                + "9- Mostrar el nivel de un dato ingresado\n"
                + "10- Mostrar la altura de un dato ingresado\n"
                + "11- Mostrar los primos de un dato ingresado\n"
                + "12- Mostrar los ancestros de un dato ingresado\n"
                + "0- Salir";
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion) {
                    case 1:
                        tree.graficar();
                        break;
                    case 2:
                        String mensaje1 = tree.inorden(tree.punta);
                        JOptionPane.showMessageDialog(null, mensaje1);
                        break;
                    case 3:
                        String mensaje2 = tree.preorden(tree.punta);
                        JOptionPane.showMessageDialog(null, mensaje2);
                        break;
                    case 4:
                        String mensaje3 = tree.posorden(tree.punta);
                        JOptionPane.showMessageDialog(null, mensaje3);
                        break;
                    case 5:
                        int hojas = tree.contarHojas(tree.punta);
                        JOptionPane.showMessageDialog(null, "Existen " + hojas + " hojas en el árbol");
                        break;
                    case 6:
                        int padres = tree.contarPadres(tree.punta);
                        JOptionPane.showMessageDialog(null, "Existen " + padres + " hojas en el árbol");
                        break;
                    case 7:
                        tree.mostrarRegistrohijo(tree.punta);
                        break;
                    case 8:
                        String letra = JOptionPane.showInputDialog("Ingrese un dato para buscar el hermano");
                        char dato = letra.charAt(0);
                        System.out.println(dato);
                        tree.mostrarHermanoDato(null, tree.punta, dato);
                        break;
                    case 9:
                        String nivel = JOptionPane.showInputDialog("Ingrese un dato para buscar el nivel");
                        char level = nivel.charAt(0);
                        int n = tree.nivelDato(tree.punta, level);
                        if (n != 0) {
                            JOptionPane.showMessageDialog(null, "El nivel del dato es: " + n);
                        }
                        break;
                    case 10:
                        String altura = JOptionPane.showInputDialog("Ingrese un dato para buscar  la altura");
                        char height = altura.charAt(0);
                        tree.alturaDato(tree.punta, height);
                        break;
                    case 11:
                        String primo = JOptionPane.showInputDialog("Ingrese un dato para buscar  los primos");
                        char cousin = primo.charAt(0);
                        tree.primos(tree.punta, cousin);
                        //JOptionPane.showMessageDialog(null, "Los ancestros de '"+ancestor+"' son: \n "+tree.getShowAncestros());                        
                        break;
                    case 12:
                        String ancestro = JOptionPane.showInputDialog("Ingrese un dato para buscar  los ancestros");
                        char ancestor = ancestro.charAt(0);
                        tree.ancestros(tree.punta, ancestor);
                        JOptionPane.showMessageDialog(null, "Los ancestros de '"+ancestor+"' son: \n "+tree.getShowAncestros());
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 0);
    }
}
