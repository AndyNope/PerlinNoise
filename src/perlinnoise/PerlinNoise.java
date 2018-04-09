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
    private int amountPoints;
    //define ArrayPoints
    private ArrayList<Point> points = new ArrayList<>();

    //minValue of Points is 2
    public PerlinNoise(int amountPoints) {
        if (amountPoints < 2) {
            System.out.println("MinValue: 2!");
            amountPoints = 2;
        }
        this.amountPoints = amountPoints;
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
        for (Point point : points) {
            System.out.println("Vec: " + point.getvX() + " " + point.getvY());
        }
        System.out.println("");
    }

    //create
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        PerlinNoise pn = new PerlinNoise(0);
        pn.fillPoints();
        pn.printAllVects();
        pn.printAllVects();
    }

}
