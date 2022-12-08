package ExampleLab;
import java.awt.*;
import java.applet.*;

// The class that draws my project
public class FlowerField extends Applet{
    public void paint(Graphics g){
        Background.drawBackground(g, 500,100);
        Background.drawBackground(g, 510,100);
        Background.drawBackground(g, 520,100);
        Background.drawBackground(g, 530,100);
        Background.drawBackground(g, 540,100);

        Clouds.drawHappyCloud(g);
        Clouds.drawAngryCloud(g);
        Clouds.drawSadCloud(g);

        Flower.drawPetals(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
        Flower.drawRoots(g);
    }

}
