/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncrdesarrollo.construcciongraficasprimitivas.clases;

import java.awt.Graphics;

/**
 *
 * @author Norbey
 */
public class DibujarLineas {
    
    public static void HacerLinea( Graphics g, int x1, int y1, int x2, int y2)
    {
       g.drawLine(x1, y1, x2, y2);
    }
    
}
