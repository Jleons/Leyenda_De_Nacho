/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author LENOVO
 */
public class Game extends AnimationTimer{
    
    private GraphicsContext lapiz;
    private  Scene escena;
    
    private Jugador jugador;
    private Fondo fondo;
    private Image place;
    private Image prota;
    private double secuencia =0;
    private int numero ; 
    
    private ArrayList<String> pulsacionTeclado = null;   
    
    

    
    public Game(Scene escena, GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.escena= escena;
        this.jugador= new Jugador(16, 18);
        this.fondo= new Fondo(-250, -500);
        this.place= new Image("image/cheruido.png");
        this.prota= new Image("image/prota.png");
        pulsacionTeclado = new ArrayList<>();
        
               
        escena.setOnKeyPressed(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    if ( !pulsacionTeclado.contains(code) )
                        pulsacionTeclado.add( code );
                }
            });

        escena.setOnKeyReleased(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    pulsacionTeclado.remove( code );
                }
            });

    }
   
    
    
     public String mostrarTexto (String texto){
                  
                  lapiz.setFill(Color.WHITE);
                  lapiz.fillRoundRect(220, 360, 260 , 55, 10, 10);
                  //lapiz.fillRect(220, 360, 260, 55);
                  lapiz.setStroke(Color.BLUE);
                  lapiz.strokeRoundRect(222, 363, 256 , 50, 10, 10);
                  lapiz.setStroke(Color.BLACK);
                  lapiz.strokeText(texto, 225, 375, 250);
                  return null;
    }
    
    @Override
    public void handle(long now) {
        
        
        
        
        lapiz.drawImage(this.place, fondo.getX(), fondo.getY());
        
        
        
                if (pulsacionTeclado.contains("LEFT")){
                  fondo.left();
                  this.secuencia= 6;
                  if(this.numero % 10 == 0){
                if(this.secuencia == 8){
                  this.secuencia = 6;
                }else{
                  this.secuencia++;
                }
          }
                }
                
                if (pulsacionTeclado.contains("RIGHT")){
                  fondo.right();
                  this.secuencia=9;
                  if(this.numero % 10 == 0){
                if(this.secuencia == 11){
                  this.secuencia = 9;
                }else{
                  this.secuencia++;
                }
          }
                }
                if (pulsacionTeclado.contains("UP")){
                  fondo.up();
                  this.secuencia=0;
                  
                  if(this.numero % 15 == 0){
                     if(this.secuencia == 2){
                  this.secuencia = 0;
                }else{
                  this.secuencia++;
                }
          }
                }
                if (pulsacionTeclado.contains("DOWN")){
                  fondo.down();
                  this.secuencia= 3;
                  
                  if(this.numero % 15 == 0){
                if(this.secuencia == 5){
                  this.secuencia = 3;
                }else{
                  this.secuencia++;
                }
          }
                }     
                
                if (pulsacionTeclado.contains("F")){
                    mostrarTexto("Hola");
                } 
                
                if (pulsacionTeclado.contains("G")){
                    mostrarTexto("NIPAHHHHHHHHHHH");
                } 
                
        lapiz.drawImage(this.prota,18*this.secuencia, 0, 18, 18, 350, 300, 18, 18);
        
             this.numero++;

        
        
        
        
        }
               
       
        
    }

