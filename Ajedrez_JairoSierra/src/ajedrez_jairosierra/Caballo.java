/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez_jairosierra;

import java.util.ArrayList;

/**
 *
 * @author Jairo Sierra
 */
public class Caballo extends Pieza{
    public Caballo( String color,int X,int Y) {
        super("Caballo", color,X,Y);
    }

    @Override
    public ArrayList<Posicion> Movimientos(Pieza[][] Matriz) {
        ArrayList<Posicion> posiciones = new ArrayList();                
        return posiciones;
    }
}
