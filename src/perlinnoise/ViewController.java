/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Application.launch;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Lucian
 */
public class ViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PerlinNoise pn = new PerlinNoise(3, 500);
        pn.fillPoints();
        pn.printAllVects();
        pn.printAllVects();
        pn.build();
        System.out.println("New PerlinNoise:\n\n");
        PerlinNoise pn2 = new PerlinNoise(3, 5);
        pn2.fillPoints();
        pn2.printAllVects();
    }

}
