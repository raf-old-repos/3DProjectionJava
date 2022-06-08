public class Matrix {


    public static double[][] matrixMultiply(double[][] m1, double[][] m2 ) throws Exception {
        double[][] result = new double[m1.length][m2[0].length];

        if (m1[0].length != m2.length) {
            throw new Exception("MATRIX ERR: Cannot multiply matrices, columns of matrix 1 do not match rows of matrix 2");
        } else {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int k = 0;  k < m2.length; k++) {
                        result[i][j] += (m1[i][k] * m2[k][j]);
                    }
                }
            }
        }

    return result;
    }


}
