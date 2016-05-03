import java.lang.Math;
import java.util.ArrayList;
public class Ring
{
    private ArrayList <Point> points;
    private LinearSubSpace linearSubSpace;

    public Ring(Point p)
    {
        this.points = new ArrayList<Point>();
        this.points.add(p);
        this.linearSubSpace = new LinearSubSpace(p);
        p.classify();
    }

    public boolean checkContaintsTo(Point p)
    {
        if(!this.points.get(0).sameRadius(p))
            return false;
        return this.linearSubSpace.isContained(p);
    }

    public boolean canBeAdded(Point p)
    {
        return this.linearSubSpace.canBeAdded(p); 
    }

    public void addPoint(Point p)
    {
        this.points.add(p);
        if (this.linearSubSpace.canBeAdded(p))
            this.linearSubSpace.addSecond(p);
        p.classify();	
    }

    public String toString()
    {
        String result = "Ring:\n";
        result += points;
        return result;
    }

    public static Ring[] classifyPointsToRings(Point[] points)
    {
        ArrayList<Ring> result = new ArrayList<Ring>();
        for(int i = 0; i < points.length; i++)
        {
            if(points[i].classified)
                continue;
            Point currentPoint = points[i];
            Ring ring = new Ring(points[i]);
            for(int j = i + 1; j < points.length; j++)
            {
                if(points[j].classified)
                    continue;
                if(ring.checkContaintsTo(points[j]) || ring.canBeAdded(points[j]))
                    ring.addPoint(points[j]);
            }
            result.add(ring);
        }
        return result.toArray(new Ring[0]);
    }

    public static String ringsToString(Ring[] rings)
    {
        String result = "";
        for(Ring r: rings)
        {
            result += r;
            result += "\n";
        }
        return result;
    }

    public RotationMatrix[] getViewOnXY()
    {
        return this.linearSubSpace.getViewOnXY();
    }
}

