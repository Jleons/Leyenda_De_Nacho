/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

import javafx.scene.image.Image;

/**
 *
 * @author LENOVO
 */
public class Fondo {
    private int x;
    private int y;
    private Image place;

    public Fondo(int x, int y, String place) {
        this.x = x;
        this.y = y;
        this.place = new Image(place);
        jkl
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getPlace() {
        return place;
    }

    
    

    

    
    

   
    
    public void up (){
    this.y++;

}
    public void down(){
    this.y--;
    }
    
    
    public void right (){
    this.x--;

}
    public void left(){
    this.x++;
    }
}
