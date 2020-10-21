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
public class DibujarAcopladas {
    
    public static void Chasis(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(100, 250);
        poligono.addPoint(360, 250);
        poligono.addPoint(360, 280);
        poligono.addPoint(100, 280);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void CirculoRueda( Graphics g, int x, int y, int alto, int ancho)
    {
       //g.drawOval(x, y, alto, ancho);
        g.setColor(Color.darkGray);
        g.drawOval(x, y, alto, ancho);
       
    }
    
    public static void Cabina1(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(130, 240);
        poligono.addPoint(120, 220);
        poligono.addPoint(190, 220);
        poligono.addPoint(190, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Cabina2(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(120, 220);
        poligono.addPoint(120, 200);
        poligono.addPoint(190, 200);
        poligono.addPoint(190, 220);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Cabina3(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(140, 200);
        poligono.addPoint(120, 140);
        poligono.addPoint(187, 140);
        poligono.addPoint(187, 200);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void Cabina4(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(110, 140);
        poligono.addPoint(110, 120);
        poligono.addPoint(200, 120);
        poligono.addPoint(200, 140);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void Bomper(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(107, 225);
        poligono.addPoint(107, 195);
        poligono.addPoint(118, 195);
        poligono.addPoint(118, 225);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    /*public static void Bagon1(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(190, 240);
        poligono.addPoint(190, 170);
        poligono.addPoint(218, 170);
        poligono.addPoint(218, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Bagon2(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(220, 240);
        poligono.addPoint(220, 170);
        poligono.addPoint(248, 170);
        poligono.addPoint(248, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Bagon3(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(250, 240);
        poligono.addPoint(250, 170);
        poligono.addPoint(278, 170);
        poligono.addPoint(278, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Bagon4(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(280, 240);
        poligono.addPoint(280, 170);
        poligono.addPoint(308, 170);
        poligono.addPoint(308, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Bagon5(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(310, 240);
        poligono.addPoint(310, 170);
        poligono.addPoint(338, 170);
        poligono.addPoint(338, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    public static void Bagon6(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(340, 240);
        poligono.addPoint(340, 170);
        poligono.addPoint(368, 170);
        poligono.addPoint(368, 240);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }*/
    
    public static void Chimenea(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(342, 180);
        poligono.addPoint(342, 130);
        poligono.addPoint(366, 130);
        poligono.addPoint(366, 180);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void Poligono(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(335, 130);
        poligono.addPoint(325, 105);
        poligono.addPoint(335, 80);
        poligono.addPoint(372, 80);
        poligono.addPoint(385, 105);
        poligono.addPoint(372, 130);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void BomperTrasero1(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(370, 190);
        poligono.addPoint(390, 190);
        poligono.addPoint(390, 230);
        poligono.addPoint(370, 230);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void BomperTrasero2(Graphics g){
        Polygon poligono = new Polygon();
        poligono.addPoint(362, 245);
        poligono.addPoint(385, 245);
        poligono.addPoint(395, 288);
        poligono.addPoint(362, 288);
        //g.setColor(Color.orange);
        g.drawPolygon(poligono);
    }
    
    public static void HacerLinea( Graphics g, int x1, int y1, int x2, int y2)
    {
       g.drawLine(x1, y1, x2, y2);
    }
    
    public static void Arco(Graphics g, int x, int y, int ancho, int alto, int inicioangulo, int arcangulo){
        
        g.drawArc(x, y, ancho, alto, inicioangulo, arcangulo);
    }
    
    

    
}
