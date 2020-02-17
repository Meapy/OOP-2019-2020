package ie.tudublin;

import processing.core.PApplet;

public class loops extends PApplet {
    public void settings() {
        size(500, 500);
    }

    public void setup() {
        colorMode(HSB);
    }
    public void draw() {
        background(0);
        design3();
        design1();
    }

    public void design1(){

        stroke(25);
        for(int i = 0; i <=500; i += 25){
            for (int j = 500; j >= 0; j -= 25){
                fill(186, 192, 224);
                line(250, 250, i, j);
            }
        }
    }
    public void design2(){

        stroke(50);
        for(int i = 0; i <=500; i += 25){
            for (int j = 500; j >= 0; j -= 25){
                fill(186, 192, 224);
                ellipse(250, 250, i, j);
            }
        }
    }
    public void design3(){

        stroke(10);
        for(int i = 0; i <=500; i += 25){
            for (int j = 500; j >= 0; j -= 25){
                fill(186, 192, 224);
                rect(0, 0, i, j);
            }
        }
    }

    public static void main(String... args) {
        PApplet.main("ie.tudublin.loops");

    }
}




