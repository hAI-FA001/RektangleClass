// can't private a class
public class Circle {
    private double radius = 10.0; // encapsulate w. private

    void setRadius(double r)
    {
        if(r>0)  // validation
         radius = r;
    }

    double getRadius()
    {
        return radius;
    }

}
