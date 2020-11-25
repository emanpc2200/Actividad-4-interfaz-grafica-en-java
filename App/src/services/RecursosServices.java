/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author Emanuel P
 */
public class RecursosServices {
    
  private Color colorEnfasis,colorComplemento;
  private Font fuente;
  private Cursor cMano,cText;
  private Border borde;
  private ImageIcon logo;
  static private RecursosServices servicio;

  private RecursosServices() {
    this.crearColores();
    this.crearFuentes();
    this.crearCursores();
    this.crearBordes();
    this.crearImagenes();
  }

  private void crearColores() {
    colorEnfasis = new Color(242,200,95);
    colorComplemento = new Color(234,236,239);
  }

  private void crearFuentes() {
     fuente = new Font("Arial", 1, 30);
  }

  private void crearCursores() { cMano = new Cursor(Cursor.HAND_CURSOR); }

  private void crearBordes() {borde = BorderFactory.createLineBorder(Color.black);}

  private void crearImagenes() {
     logo = new ImageIcon("resourses/images/PrimeVideo.PNG");
  }

 

  public Color getColorEnfasis() { return colorEnfasis; }

  public Color getColorComplemento() { return colorComplemento; }

  public Font getFuente() { return fuente; }

  public Cursor getCMano() { return cMano; }
  
   public Cursor getCtext() { return cText; }

  public Border getBborde() { return borde; }

  public ImageIcon getLogo() { return logo; }

  public static RecursosServices getService() {
    if (servicio == null) servicio = new RecursosServices();
    return servicio;
  }
}
