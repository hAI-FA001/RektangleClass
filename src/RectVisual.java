import java.awt.*;
import javax.swing.*;

public class RectVisual extends JPanel{
    public Rectangle r1, r2, r;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int scale = 5;


        r = r1.getOverlappedRect(r2);

        g.drawRect(r1.x * scale, r1.y * scale, r1.length * scale, r1.height * scale);
        g.drawRect(r2.x * scale, r2.y * scale, r2.length * scale, r2.height * scale);
        if (r == null)
            System.out.println("No intersection...");
        else
        {
            System.out.println("They intersect!!!"+"\t(" + r.x + ", " + r.y +")\tArea: "+r.length*r.height+"\tLength: "+r.length+", Height: "+r.height);
            g.fillRect(r.x * scale, r.y * scale, r.length * scale, r.height * scale);
        }


    }
}
