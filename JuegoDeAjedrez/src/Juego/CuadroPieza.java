
package Juego;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jhon Frayser
 */
public class CuadroPieza extends JPanel {

    private int inX;
    private int inY;
    public JLabel lbl = new JLabel();
    // para imprimir o mostrar una imagen en un jpanel
    // se realiza mediante un JLabel.
    private Color fondo;
    private Color resaltar;

    public CuadroPieza(int x, int y) {
        add(lbl);// agrega el label a Jpanel .add es un metodo del Jpanel
        this.inX = x;
        this.inY = y;
    }

     /**
     * @return the inX
     */
    public int getInX() {
        return inX;
    }

    /**
     * @param inX the inX to set
     */
    public void setInX(int inX) {
        this.inX = inX;
    }

    /**
     * @return the inY
     */
    public int getInY() {
        return inY;
    }

    /**
     * @param inY the inY to set
     */
    public void setInY(int inY) {
        this.inY = inY;
    }

    /**
     * @return the fondo
     */
    public Color getFondo() {
        return fondo;
    }

    /**
     * @param fondo the fondo to set
     */
    public void setFondo(Color fondo) {
        setBackground(fondo);// se hereda de un jpnael para poner un fondo
        setBorder(null);
        this.fondo = fondo;
    }

    /**
     * @return the resaltar
     */
    public Color getResaltar() {
        return resaltar;
    }

    /**
     * @param resaltar the resaltar to set
     */
    public void setResaltar(Color resaltar) {
        this.resaltar = resaltar;
    }
}

