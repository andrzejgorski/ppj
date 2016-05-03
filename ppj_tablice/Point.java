import java.lang.Math;
import java.util.ArrayList;

public class Point
{
    protected double x;
    protected double y;
    protected double z;
    protected double r;
    protected boolean classified;

    private static double getRadius(double x, double y, double z)
    {
        double sub_radius = Math.sqrt(x * x + y * y);
        return Math.sqrt(sub_radius * sub_radius + z * z);
    }

    public Point(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = getRadius(x, y, z);
        this.classified = false;
    }
    public String toString()
    {
        String classified_msg;
        if(classified)
            classified_msg = "classified ";
        else
            classified_msg = "unclassified ";
        return classified_msg + "[" + Double.toString(x) + ", " + Double.toString(y) + ", " + Double.toString(z) + "] r = " + Double.toString(r) + " \n";
    }

    public static String pointsToString(Point[] points)
    {
        String result = "";
        for (Point p: points)
        {
            result += p;
        }
        return result;
    }

    public static Point[] fromInts(int[] input)
    {
        int length = input.length / 3;
        Point[] result = new Point[length];
        for(int i = 0; i < length; i++)
        {
            result[i] = new Point(input[i * 3], input[3 * i + 1], input[3 * i + 2]);
        }
        return result; 
    }

    public boolean sameRadius(Point p)
    {
        return r == p.r; 
    }

    public void classify()
    {
        this.classified = true; 
    }

    public boolean areLinearyDependent(Point p)
    {
        double ratio;
        if(this.x != 0 && p.x != 0)
        {
            if(this.y == 0 && p.y == 0 && this.z == 0 && p.z == 0)
                return true;
            ratio = this.x / p.x;
            if(this.y != 0 && p.y != 0 && this.z != 0 && this.z != 0)
                return (ratio == (this.y / p.y)) && (ratio == (this.z / p.z));
            if(this.y == 0 && p.y == 0)
                return ratio == this.z / p.z;
            if(this.z == 0 && p.z == 0)
                return ratio == this.y / p.y;
        }
        if(this.x == 0 && p.x == 0)
        {
            if(this.y != 0 && p.y != 0 && this.z != 0 && this.z != 0)
                return (this.y / p.y) == (this.z / p.z);
            if(this.y == 0 && p.y == 0 && this.z != 0 && p.z != 0)
                return true;
            if(this.z == 0 && p.z == 0 && this.y != 0 && p.y != 0)
                return true;
            return this.y == 0 && p.y == 0 && this.z == 0 && p.z == 0;
        }
        else
            return false;

    }

    public static Point scalarMultiplication(Point p, double scalar)
    {
        return new Point(p.x * scalar, p.y * scalar, p.z * scalar);
    }

    public static Point addPoints(Point p1, Point p2)
    {
        return new Point(p1.x + p2.x, p1.y + p2.y, p1.z + p2.z); 
    }

    public boolean isZero()
    {
        return this.x == 0 && this.y == 0 && this.z == 0; 	
    }

    public Point copy()
    {
        return new Point(this.x, this.y, this.z); 
    }
}
