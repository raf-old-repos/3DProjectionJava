import java.util.Arrays;
import java.util.stream.IntStream;

public class Vector3 {
    public double x;
    public double y;
    public double z;
    public double length;
    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.length = (double) Math.sqrt((this.x * this.x) * (this.y * this.y) * (this.z * this.z));
    }
    public Vector3 scalarMul(int s) {
        this.x *= s;
        this.y *= s;
        this.z *= s;
        return this;
    }

    public static Vector3 multiplyWithMatrix(Vector3 v, double[][] m) {
        int cols = m[0].length;

        // Praying to the stackoverflow gods this works
        var result = Arrays.stream(m).mapToDouble(floats -> IntStream.range(0, cols)
                .mapToDouble(col -> floats[col] * v.toArray()[col])
                .sum()).toArray();

        return new Vector3(result[0], result[1], result[2]);

    }

    public double[] toArray() {
        return new double[] {
                this.x, this.y, this.z
        };
    }
    public String toString() {
        var x = String.valueOf(this.x);
        var y = String.valueOf(this.y);
        var z = String.valueOf(this.z);

        return String.format(x, y, z);
    }


}


