/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncrdesarrollo.construcciongraficasprimitivas.clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Norbey
 */
public class DibujarPoligono {

    public static void Poligono1(Graphics g){
        Polygon poligono1 = new Polygon();
        poligono1.addPoint(200, 200);
        poligono1.addPoint(250, 200);
        poligono1.addPoint(265, 250);
        poligono1.addPoint(225, 275);
        poligono1.addPoint(190, 250);
        g.setColor(Color.green);
        g.fillPolygon(poligono1);
    }
    
    public static void Poligono2(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(200, 198);
        poligono.addPoint(250, 120);
        poligono.addPoint(250, 198);
        g.setColor(Color.cyan);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono3(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(252, 120);
        poligono.addPoint(272, 120);
        poligono.addPoint(272, 140);
        poligono.addPoint(252, 140);
        g.setColor(Color.blue);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono4(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(230, 119);
        poligono.addPoint(235, 88);
        poligono.addPoint(272, 119);
        g.setColor(Color.pink);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono5(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(274, 124);
        poligono.addPoint(290, 140);
        poligono.addPoint(274, 140);
        g.setColor(Color.orange);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono6(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(261, 142);
        poligono.addPoint(272, 162);
        poligono.addPoint(252, 162);
        g.setColor(Color.pink);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono7(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(198, 200);
        poligono.addPoint(188, 248);
        poligono.addPoint(148, 200);
        g.setColor(Color.orange);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono8(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(198, 198);
        poligono.addPoint(170, 158);
        poligono.addPoint(120, 158);
         poligono.addPoint(148, 198);
        g.setColor(Color.blue);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono9(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(146, 198);
        poligono.addPoint(118, 158);
        poligono.addPoint(115, 270);
        g.setColor(Color.green);
        g.fillPolygon(poligono);
    }
    
    public static void Poligono10(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(223, 277);
        poligono.addPoint(227, 277);
        poligono.addPoint(227, 327);
        poligono.addPoint(223, 327);
        g.setColor(Color.orange);
        g.fillPolygon(poligono);
    }
    
    public static void HacerCirculoPata( Graphics g, int x, int y, int ancho, int alto)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.pink);
        g.fillOval(x, y, ancho, alto);
       
    }
    
    
}
