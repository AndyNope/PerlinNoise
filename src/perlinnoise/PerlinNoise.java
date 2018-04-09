/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kbwschuler
 */
public class PerlinNoise extends Application{

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
<<<<<<< HEAD
    public void looping() {
        for (int x = 0; x < amountPoints - 1; x++) {
            for (int y = 0; y < amountPoints - 1; y++) {

            }
        }
    }

=======
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
>>>>>>> 5bbe977a2d323adb347f364cd7236e4946271068
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        PerlinNoise pn = new PerlinNoise(0, 4);
=======
        launch(args);
        PerlinNoise pn = new PerlinNoise(0);
>>>>>>> 5bbe977a2d323adb347f364cd7236e4946271068
        pn.fillPoints();
        pn.printAllVects();
        pn.printAllVects();
        System.out.println("New PerlinNoise:\n\n");
        PerlinNoise pn2 = new PerlinNoise(3, 5);
        pn2.fillPoints();
        pn2.printAllVects();

    }

}
