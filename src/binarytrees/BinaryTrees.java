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
                + "1- Mostrar recorrido inorden\n"
                + "2- Mostrar recorrido preorden\n"
                + "3- Mostrar recorrido posorden\n"
                + "4- Cantidad de hojas\n"
                + "5- Cantidad de padres\n"
                + "6- Mostrar registros de un solo hijo\n"
                + "7- Mostrar hermano de un dato ingresado\n"
                + "8- Mostrar el nivel de un dato ingresado\n"
                + "9- Mostrar la altura de un dato ingresado\n"
                + "10- Mostrar los primos de un dato ingresado\n"
                + "10- Mostrar los ancestros de un dato ingresado\n"
                + "0- Salir";
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion) {
                    case 1:
                        String mensaje1 = tree.inorden(tree.punta);
                        JOptionPane.showMessageDialog(null, mensaje1);
                        break;
                    case 2:
                        String mensaje2 = tree.preorden(tree.punta);
                        JOptionPane.showMessageDialog(null, mensaje2);
                        break;
                    case 3:
                        String mensaje3 = tree.posorden(tree.punta);
                        JOptionPane.showMessageDialog(null, mensaje3);
                        break;
                    case 4:
                        int hojas = tree.contarHojas(tree.punta);
                        JOptionPane.showMessageDialog(null, "Existen " + hojas + " hojas en el árbol");
                        break;
                    case 5:
                        int padres = tree.contarPadres(tree.punta);
                        JOptionPane.showMessageDialog(null, "Existen " + padres + " hojas en el árbol");
                        break;
                    case 6:
                        tree.mostrarRegistrohijo(tree.punta);
                        break;
                    case 7:
                        String letra = JOptionPane.showInputDialog("Ingrese un dato para buscar el hermano");
                        char dato = letra.charAt(0);
                        System.out.println(dato);
                        tree.mostrarHermanoDato(null, tree.punta, dato);
                        break;
                    case 8:
                        String nivel = JOptionPane.showInputDialog("Ingrese un dato para buscar el nivel");
                        char level = nivel.charAt(0);
                        tree.nivelDato(tree.punta, level);
                        break;
                    case 9:
                        String altura = JOptionPane.showInputDialog("Ingrese un dato para buscar el nivel");
                        char height = altura.charAt(0);
                        tree.nivelDato(tree.punta, height);
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
