/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leyendadenacho;

/**
 *
 * @author LENOVO
 */
public class Fondo {
    private int x;
    private int y;

    public Fondo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
