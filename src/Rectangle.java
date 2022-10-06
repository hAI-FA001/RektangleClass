import org.w3c.dom.css.Rect;

public class Rectangle {
    int length = 1, height = 2;
    int x=0,y=0;

    public Rectangle(int length, int height, int x, int y) {
        this.length = length;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    void setLength(int l)
    {
        length = l;
    }

    void setHeight(int h)
    {
        height = h;
    }

    double getLength()
    {
        return  length;
    }

    double getHeight()
    {
        return height;
    }

    boolean intersects(Rectangle r2)
    {
        if(this.x > r2.x+r2.length || this.x+this.length < r2.x ||
            this.y > r2.y+r2.height || this.y+this.height < r2.y)
                return false;
        return true;
    }
    Rectangle getOverlappedRect(Rectangle r2)
    {
        int x2 = this.x+this.length, r2x2 = r2.x+r2.length,
               y2 = this.y+this.height, r2y2 = r2.y+r2.height;

        int rx = (this.x > r2.x)? this.x : r2.x,
            rlen = (x2 < r2x2)? x2 : r2x2,
            ry = (this.y > r2.y)? this.y : r2.y,
            rhei = (y2 < r2y2)? y2 : r2y2;

        if(rx > rlen || ry > rhei)
            return null;

        return new Rectangle(rlen-rx, rhei-ry, rx, ry);
    }
}