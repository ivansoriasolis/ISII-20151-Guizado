/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javax.swing.ImageIcon;

/**
 * Esta clase abstracta establecerá las funciones basicas de toda pieza, sera la clase padre, de las demas piezas
 * Se declara abstracta para que no pueda ser instanciada.
 * @author JhonFrayser
 */
public abstract class Pieza {

    /**
     * Es una variable static o variable de clase, establece cuantos mavimientos hay actualmente sin realizar algun cambio(comer a otras piezas)
     * Esto es para cumplir la regla que dice que no pueden pasar mas de 50 turnos sin comer alguna pieza del oponente.
     */
    private static int cantMovimientosSinCambios = 0;

    /**
     * @return the cantMovimientosSinCambios
     */
    public static int getCantMovimientosSinCambios() {
        return cantMovimientosSinCambios;
    }

    /**
     * @param aCantMovimientosSinCambios the cantMovimientosSinCambios to set
     */
    public static void setCantMovimientosSinCambios(int aCantMovimientosSinCambios) {
        cantMovimientosSinCambios = aCantMovimientosSinCambios;
    }
    /**
     * Establece si la pieza ya se ha movido alguna vez, dado que algunas piezas solo pueden realizar determinados movimientos en su primer movimiento
     * Como es el peon que puede moverse dos casillas hacia adelante en su primer movimiento.
     * O el rey que solo puede hacer enroque en su primer movimiento
     */
    private boolean firstmov = true;
    /**
     * Establece el peso de la pieza, esto quiere decir cuanto vale una pieza, los valores de las piezas serán establecidos por las clases que hereden.
     * Los valores son los siquientes:
     * Rey: -- No tiene peso es el mas importante, le estableceremos un peso 10
     * Reina: 8
     * Torre: 5
     * Caballo: 3
     * Alfil: 3
     * Peon: 1
     */
    private int peso;
    /**
     * Establece el color de la pieza
     * Blanco: 1
     * Negro: -1
     */
    private int color;
    /**
     * Es la imagen de la pieza, que será declarada en las clases hijas.
     */
    private ImageIcon imagenPieza;
    /**
     * Es el cuadro del tablero en donde actualmente esta la pieza.
     */
    private CuadroPieza cuadroPieza = null;

    /**
     * Constructor.
     * @param color
     * Blanco: 1
     * Negro: -1
     */
    public Pieza(int color) {
        this.color = color;
    }

    /**
     * Este metodo valida el movimiento, solo valida, NO Mueve las piezas
     * Este metodo es un metodo general, que todas las piezas van a cumplir, Ademas cada pieza tiene otras validaciones
     * Las clases piezas que hereden pueden sobreescribir el metodo y reutilizarlo a la vez.
     * @param Destino
     * @param tbl
     * @return boolean TRUE si es un movimiento valido
     */
   ////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////

    /**
     * Este metodo mueve la pieza a un cuadro destino
     * @param Destino
     * @param tbl
     * @return boolean FALSE si no logra mover la pieza.
     */
   //////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////
/**
 * Si ya no existe movimientos posibles. el jugador esta ahogado.
 * @param turno
 * @param tbl
 * @return
 */
////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////

    /**
     *
     * @return color de la pieza.
     * Blanco: 1
     * Negro: -1
     */
    public int getColor() {
        return color;
    }

    /**
     *
     * @param color
     * Blanco: 1
     * Negro: -1
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * @return the firstmov
     */
    public boolean isFirstmov() {
        return firstmov;
    }

    /**
     * @param firstmov the firstmov to set
     */
    public void setFirstmov(boolean firstmov) {
        this.firstmov = firstmov;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the imagenPieza
     */
    public ImageIcon getImagenPieza() {
        return imagenPieza;
    }

    /**
     * @param imagenPieza the imagenPieza to set
     */
    public void setImagenPieza(ImageIcon imagenPieza) {
        this.imagenPieza = imagenPieza;
    }

    /**
     * @return the cuadroPieza
     */
    public CuadroPieza getCuadroPieza() {
        return cuadroPieza;
    }

    /**
     * @param cuadroPieza the cuadroPieza to set
     */
    public void setCuadroPieza(CuadroPieza cuadroPieza) {
        this.cuadroPieza = cuadroPieza;
    }
}
