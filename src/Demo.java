import org.w3c.dom.css.Rect;

import javax.swing.JFrame;
import java.awt.Color;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {
        boolean showGUI = false;  // change to true to display the rectangles visually

        // ignore
        // pbsvm, sout, FQN
        // can init obj w/ null

        /*Circle c1 = new Circle(), c2 = new Circle(); // invokes constructor

        System.out.println("Radius of c1: "+c1.getRadius());
        c2.setRadius(22.7);

        System.out.println("Radius of c2: "+c2.getRadius());

        System.out.printf("%s", "\n\n");*/

        Scanner s = new Scanner(System.in);
        Rectangle r1, r2;

        System.out.println("Enter the first rectangle's length, height, x and y coordinates, separated by spaces (can only be integer):");
        int l = s.nextInt(), h = s.nextInt(), x = s.nextInt(), y = s.nextInt();

        r1 = new Rectangle(l,h,x,y);

        System.out.println("Enter the second rectangle's length, height, x and y coordinates, separated by spaces (can only be integer):");
        l = s.nextInt();
        h = s.nextInt();
        x = s.nextInt();
        y = s.nextInt();

        r2 = new Rectangle(l,h,x,y);

        /*r1.setLength(30);
        r1.setHeight(30);
        r2.setLength(50);
        r2.setHeight(70);*/

        /*System.out.println("Length and Height of r1: "+r1.length +" "+r1.height);
        System.out.println("Length and Height of r2: "+r2.getLength() + " " + r2.getHeight());

        r1.x = 30; r1.y = 12;
        r2.x = 57; r2.y = 30;

        System.out.printf("X1, Y1 : %d, %d", r1.x,r1.y);
        System.out.printf("\nX2, Y2 : %d, %d\n", r2.x,r2.y);*/

        if(r1.intersects(r2)) {
            System.out.println("They intersect.\nOverlapped rectangle's info:");
            Rectangle r = r1.getOverlappedRect(r2);
            System.out.printf("(%d,%d),(%d,%d)", r.x, r.y, r.length+r.x, r.height+r.y);

            if(showGUI)
            {
                RectVisual rectDraw = new RectVisual();

                rectDraw.r = r;
                rectDraw.r1 = r1;
                rectDraw.r2 = r2;

                JFrame app = new JFrame();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.setSize(600, 600);
                app.setBackground(new Color(0x123456));
                app.add(rectDraw);
                app.setVisible(true);
            }
        }
        else {
            System.out.println("They don't intersect.");

            if(showGUI)
            {
                RectVisual rectDraw = new RectVisual();

                rectDraw.r = null;
                rectDraw.r1 = r1;
                rectDraw.r2 = r2;

                JFrame app = new JFrame();
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.setSize(600, 600);
                app.setBackground(new Color(0x123456));
                app.add(rectDraw);
                app.setVisible(true);
            }
        }

        System.out.printf("\n\n");
    }

}
