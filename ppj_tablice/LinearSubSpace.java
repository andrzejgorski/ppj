import java.lang.Math;
import java.util.ArrayList;
public class LinearSubSpace
{
    private Point vector1;
    private Point vector2 = null;

    public LinearSubSpace(Point p)
    {
        this.vector1 = p;
    }

    public boolean isContained(Point p)
    {
        if(this.vector2 == null)
            return vector1.areLinearyDependent(p);
        if(vector1.areLinearyDependent(p))
            return true;
        Point reduced = reduce(p);
        return vector2.areLinearyDependent(reduced) || reduced.isZero();
    }

    public void addSecond(Point p)
    {
        this.vector2 = reduce(p);
    }

    // This function return view on linear sub space OYZ.
    private Point reduce(Point p)
    {
        if(p.x == 0)
            return p.copy();
        double ratio = this.vector1.x / p.x;
        Point tmp_point = Point.scalarMultiplication(p, ratio);
        return Point.addPoints(p, tmp_point);
    }

    public boolean isLinearyWithFirstVector(Point p)
    {
        return this.vector1.areLinearyDependent(p);
    }

    public boolean isCompleted()
    {
        return this.vector2 != null;
    }

    public boolean canBeAdded(Point p)
    {
        return (!this.isLinearyWithFirstVector(p) && !this.isCompleted() && this.vector1.sameRadius(p));
    }

    public RotationMatrix[] getViewOnXY()
    {
        if(!isCompleted())
            // jeden wektor nie definiuje przestrzeni liniowej
            ;//throw Exception("Linear space not defined at all.");
        double alphaYZ = Math.asin(this.vector1.z / Math.sqrt(this.vector1.z * this.vector1.z + this.vector1.y * this.vector1.y));
        double alphaXZ = Math.asin(this.vector1.z / Math.sqrt(this.vector1.z * this.vector1.z + this.vector1.x * this.vector1.x));
        return new RotationMatrix[]{new RotationMatrix(alphaYZ, 'x'), new RotationMatrix(alphaXZ, 'y')};
    }
}

