/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.util.ArrayList;

/**
 *
 * @author kbwschuler
 */
public class PerlinNoise {

    //define amount of points of the length of a square
    private int amountPoints, pixels;
    //define ArrayPoints
    private ArrayList<Point> points = new ArrayList<>();

    //minValue of Points is 2
    public PerlinNoise(int amountPoints, int pixels) {
        if (amountPoints < 2) {
            System.out.println("MinValue: 2!");
            amountPoints = 2;
        }
        this.amountPoints = amountPoints;
        this.pixels = pixels;
    }

    /**
     * **********************now the functions**************************
     */
    //fill the Points
    public void fillPoints() {
        for (int x = 0; x < amountPoints; x++) {
            for (int y = 0; y < amountPoints; y++) {
                points.add(new Point(x, y));

            }
        }
    }
//    //Return fuction
//    public ArrayList<Point> getPoints(){
//        ArrayList<Point> points = new ArrayList<>();
//        for (int x = 0; x < amountPoints; x++) {
//            for (int y = 0; y < amountPoints; y++) {
//                points.add(new Point(x, y));
//                
//            }
//        }
//        return points;
//    }

    //output
    public void printAllVects() {
        int i = 1;
        for (Point point : points) {
            System.out.println("Vec:" + i + " (" + point.getvX() + " " + point.getvY() + ")");
            i++;
        }
        System.out.println("");
    }

    //create
    public void build() {
        //loop for 
        for (int i = 0; i < points.size() - 3; i++) {
            pixelLooping(points.get(i),points.get(i+1),points.get(i+2),points.get(i+3));
        }
    }

    public void pixelLooping(Point p1, Point p2, Point p3, Point p4) {
        if (getPixels() != 0) {
            for (int x = 0; x < getPixels(); x++) {
                for (int y = 0; y < getPixels(); y++) {
                    
                }
            }
        } else {
            System.out.println("Please first fill some points! ");
        }

    }

    public void startAlgorithm() {

    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        PerlinNoise pn = new PerlinNoise(0);
//        pn.fillPoints();
//        pn.printAllVects();
//        pn.printAllVects();
//    }
    public int getAmountPoints() {
        return amountPoints;
    }

    public void setAmountPoints(int amountPoints) {
        this.amountPoints = amountPoints;
    }

    public int getPixels() {
        return pixels;
    }

    public void setPixels(int pixels) {
        this.pixels = pixels;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

}
