/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Rojo5
 */
public class Triangulo extends Forma{
    
    public Triangulo(int _posX, int _posY,  Color _color, boolean _relleno){
        super(_posX, _posY, new int[3], new int[3], _color, _relleno, 3);
    }
}
