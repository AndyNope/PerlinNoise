/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlinnoise;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author Lucian
 */
public class ViewController implements Initializable {
    
    @FXML
    private ImageView iv;
    
    private PerlinNoise pn;
    private int imageHeight;
    private int imageWidth;
    private double time = 0;
    private BufferedImage image;

    public BufferedImage getNoiseImage() {
        
        this.time += 0.01;
        for (int y = 0; y < this.imageHeight; y++) {
            for (int x = 0; x < this.imageWidth; x++) {
                double dx = (double) x / this.imageHeight;
                double dy = (double) y / this.imageHeight;
                int frequency = 6;
                double noise = this.pn.noise((dx * frequency) + this.time, (dy * frequency) + this.time);
                noise = (noise - 1) / 2;
                int b = (int) (noise * 0xFF);
                int g = b * 0x100;
                int r = b * 0x10000;
                int finalValue = r;
                this.image.setRGB(x, y, finalValue);
            }
        }
        return this.image;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        this.imageHeight = (int) this.iv.getScene().getHeight();
//        this.imageWidth = (int) this.iv.getScene().getWidth();
        this.imageHeight = 480;
        this.imageWidth = 640;
        this.image  = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        this.pn = new PerlinNoise();
        
        
        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.millis(30), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                iv.setImage(SwingFXUtils.toFXImage(getNoiseImage(), null));
            }
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();
    }
}