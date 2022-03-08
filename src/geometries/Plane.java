package geometries;

import primitives.Double3;
import primitives.Point;
import primitives.Vector;

public class Plane implements Geometry{

    Point p0;
    Vector normalVector;

    public Plane(Vector vec, Point p){
        normalVector = vec.normalize();
        p0 = p;
    }
    public Plane(Point p1, Point p2, Point p3){
            p0 = p1;// arbitrary choice
            normalVector = null; //must calc normal vector from coordinates!
    }

    @Override
    public Vector getNormal(Point pointOnSurface) {
        //CHECK IF POINT IS ON PLANE:
        //code..
        //CALC AND RETURN NORMAL:
        //code...
        return null;
    }
    public Point getP0() {
        return p0;
    }

    //GETTERS:
    public Vector getNormal() { return normalVector;}
}
