/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.util.Random;

/**
 *
 * @author kbwschuler
 */
public class Point {
    private int x,y,vX,vY;
    private Random rand = new Random();
    

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.vX = rand.nextInt(10)+1;
        this.vY = rand.nextInt(10)+1;
    }
    
   
    //Getter and Setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getvX() {
        return vX;
    }

    public void setvX(int vX) {
        this.vX = vX;
    }

    public int getvY() {
        return vY;
    }

    public void setvY(int vY) {
        this.vY = vY;
    }
    
    
    
    
}
