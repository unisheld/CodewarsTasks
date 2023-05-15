//A format for expressing an ordered list of integers is to use a comma separated list of either
//
//        individual integers
//        or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'.
//        The range includes all integers in the interval including both endpoints.
//        It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
//        Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.
//
//        Example:
//
//        Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
//        # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
//        Courtesy of rosettacode.org

package unisheld;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int start = arr[0];
        int end = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == end + 1) {
                end = arr[i];
            } else {
                if (sb.length() > 0) {
                    sb.append(",");
                }

                if (start == end) {
                    sb.append(start);
                } else if (end - start == 1) {
                    sb.append(start).append(",").append(end);
                } else {
                    sb.append(start).append("-").append(end);
                }

                start = arr[i];
                end = arr[i];
            }
        }

        if (sb.length() > 0) {
            sb.append(",");
        }

        if (start == end) {
            sb.append(start);
        } else if (end - start == 1) {
            sb.append(start).append(",").append(end);
        } else {
            sb.append(start).append("-").append(end);
        }

        return sb.toString();
    }
}
