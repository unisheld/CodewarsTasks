//Write a function that accepts a square matrix (N x N 2D array) and returns the determinant of the matrix.
//
//        How to take the determinant of a matrix -- it is simplest to start with the smallest cases:
//
//        A 1x1 matrix |a| has determinant a.
//
//        A 2x2 matrix [ [a, b], [c, d] ] or
//
//        |a  b|
//        |c  d|
//        has determinant: a*d - b*c.
//
//        The determinant of an n x n sized matrix is calculated by reducing the problem to the calculation of the determinants of n matrices ofn-1 x n-1 size.
//
//        For the 3x3 case, [ [a, b, c], [d, e, f], [g, h, i] ] or
//
//        |a b c|
//        |d e f|
//        |g h i|
//        the determinant is: a * det(a_minor) - b * det(b_minor) + c * det(c_minor) where det(a_minor)
//        refers to taking the determinant of the 2x2 matrix created by crossing out the row and column in which the element a occurs:
//
//        |- - -|
//        |- e f|
//        |- h i|
//        Note the alternation of signs.
//
//        The determinant of larger matrices are calculated analogously, e.g. if M is a 4x4 matrix with first row [a, b, c, d], then:
//
//        det(M) = a * det(a_minor) - b * det(b_minor) + c * det(c_minor) - d * det(d_minor)

package unisheld;

public class Matrix {
    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        } else {
            int det = 0;
            int sign = 1;
            for (int i = 0; i < n; i++) {
                int[][] minor = new int[n-1][n-1];
                for (int j = 1; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (k < i) {
                            minor[j-1][k] = matrix[j][k];
                        } else if (k > i) {
                            minor[j-1][k-1] = matrix[j][k];
                        }
                    }
                }
                det += sign * matrix[0][i] * determinant(minor);
                sign = -sign;
            }
            return det;
        }
    }
}
