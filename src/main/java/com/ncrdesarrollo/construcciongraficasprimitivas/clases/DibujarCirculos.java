/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncrdesarrollo.construcciongraficasprimitivas.clases;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Norbey
 */
public class DibujarCirculos {
    
    public static void HacerCapaRoja( Graphics g, int x, int y, int alto, int ancho)
    {
        Color myColor = Color.decode("#BE2302");
       //g.drawOval(x, y, alto, ancho);
        g.setColor(myColor);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerCirculoCentro( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.darkGray);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerCirculoAmarillo( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerCirculoOjo( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.BLACK);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerCirculoOjoBlanco( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.WHITE);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerLineaCentro( Graphics g, int x1, int y1, int x2, int y2)
    {
       g.drawLine(x1, y1, x2, y2);
    }
    
    public static void HacerLineaPata( Graphics g, int x1, int y1, int x2, int y2)
    {
       g.drawLine(x1, y1, x2, y2);
    }
    
    
    public static void HacerCirculoPatasAzules( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerCirculoPatasVerdes( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.GREEN);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerCirculoPatasNaranjas( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, alto, ancho);
       
    }
    
    public static void HacerBocaAntenas(Graphics g, int x, int y, int ancho, int alto, int inicioangulo, int arcangulo){
        
        g.drawArc(x, y, ancho, alto, inicioangulo, arcangulo);
    }
    
}
