import java.lang.Math;
import java.util.ArrayList;

public class RotationMatrix
{
    private double[] matrix;
    private char dimension;

    public RotationMatrix(double angle, char dimension)
    {
        this.dimension = dimension;
        if(Double.isNaN(angle))
        {
            this.matrix = new double[]{1, 0, 0, 0, 1, 0, 0, 0, 1};
        }
        else
            switch (dimension)
            {
                case 'x':
                    this.matrix = new double[]{1, 0, 0, 0, Math.cos(angle), -1 * Math.sin(angle), 0, Math.sin(angle), Math.cos(angle)};
                    break;
                case 'y':
                    this.matrix = new double[]{Math.cos(angle), 0, Math.sin(angle), 0, 1, 0, -1 * Math.sin(angle), 0, Math.cos(angle)};
                    break;

                case 'z':
                    this.matrix = new double[]{Math.cos(angle), -1 * Math.sin(angle), 0, Math.sin(angle), Math.cos(angle), 0, 0, 0, 1};
                    break;
            }
    }

    public String toString()
    {
        String result = "RotationMatrix: " + this.dimension + "\n";
        result += "|" + this.matrix[0] + ", " + this.matrix[1] + ", " + this.matrix[2] + "|\n";
        result += "|" + this.matrix[3] + ", " + this.matrix[4] + ", " + this.matrix[5] + "|\n";
        result += "|" + this.matrix[6] + ", " + this.matrix[7] + ", " + this.matrix[8] + "|\n";
        return result;
    }
}

