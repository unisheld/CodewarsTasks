//The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8.
// It's easy to see that the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80
//
//        Hint:
//        See Fibonacci sequence
//
//        Ref:
//        http://oeis.org/A000045
//
//        The function perimeter has for parameter n where n + 1 is the number of squares
//        (they are numbered from 0 to n) and returns the total perimeter of all the squares.
//
//        perimeter(5)  should return 80
//        perimeter(7)  should return 216

package unisheld;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            sum = sum.add(b.multiply(BigInteger.valueOf(4)));
            BigInteger temp = b;
            b = a.add(b);
            a = temp;
        }

        return sum;
    }
}
