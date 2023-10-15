package data.two;
import data.one.Circle;
public class Circular { 
    Circle bottom;
    double height;
    public Circular(Circle c,double h) { 
       bottom = c;
       height = h;
    }
    public double getVolme() {
       return bottom.getArea()*height;
    }
}
