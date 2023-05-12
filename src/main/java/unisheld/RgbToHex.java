//The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned.
// Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
//
//        Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
//
//        The following are examples of expected output values:
//
//        RgbToHex.rgb(255, 255, 255) // returns FFFFFF
//        RgbToHex.rgb(255, 255, 300) // returns FFFFFF
//        RgbToHex.rgb(0, 0, 0)       // returns 000000
//        RgbToHex.rgb(148, 0, 211)   // returns 9400D3

package unisheld;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        r = Math.min(Math.max(r, 0), 255);
        g = Math.min(Math.max(g, 0), 255);
        b = Math.min(Math.max(b, 0), 255);

        String hexR = Integer.toHexString(r);
        String hexG = Integer.toHexString(g);
        String hexB = Integer.toHexString(b);

        if (hexR.length() == 1) hexR = "0" + hexR;
        if (hexG.length() == 1) hexG = "0" + hexG;
        if (hexB.length() == 1) hexB = "0" + hexB;

        return hexR.toUpperCase() + hexG.toUpperCase() + hexB.toUpperCase();
    }
}
