/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytrees;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author christom
 */
public class GraficaArbolBinario extends JPanel {

    private final Tree miarbol;
    public static final int DIAMETRO = 40;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public GraficaArbolBinario(Tree miarbol) {
        this.miarbol = miarbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        pintar(g, getWidth() / 2, 20, miarbol.getPunta());
    }

    private void pintar(Graphics g, int x, int y, Nodo r) {
        if (r != null) {
            g.setColor(Color.blue);
            int EXTRA = new Tree().nodosCompletos(r) * (ANCHO / 2);
            // g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.fillOval(x, y, DIAMETRO, DIAMETRO);
            g.setColor(Color.white);
            g.drawString(r.getDato() + "", x + 10, y + 20);
            g.setColor(Color.blue);
            if (r.getLi()!= null) {
                g.drawLine(x + RADIO - 5, y + RADIO + 15, x - ANCHO - EXTRA + RADIO, y - 15 + ANCHO + RADIO);
            }
            if (r.getLd()!= null) {
                g.drawLine(x + RADIO - 5, y + RADIO + 15, x + ANCHO + EXTRA + RADIO, y - 15 + ANCHO + RADIO);
            }
            pintar(g, x - ANCHO - EXTRA, y + ANCHO, r.getLi());
            pintar(g, x + ANCHO + EXTRA, y + ANCHO, r.getLd());

        }
    }
}
