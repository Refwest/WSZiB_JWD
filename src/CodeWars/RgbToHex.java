package CodeWars;

/*The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

Examples (input --> output):
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"*/
public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(1, 0, 300));
    }

    public static String rgb(int r, int g, int b) {
        if (r > 255) {
            r = 255;
        } else if (r < 0) {
            r = 0;
        }

        if (b > 255) {
            b = 255;
        } else if (b < 0) {
            b = 0;
        }
        if (g > 255) {
            g = 255;
        } else if (g < 0) {
            g = 0;
        }

        String rHex = String.valueOf(Integer.toHexString(r));
        String gHex = (String.valueOf(Integer.toHexString(g)));
        String bHex = (String.valueOf(Integer.toHexString(b)));
        return (String.format("%2S%2S%2S", rHex, gHex, bHex).replaceAll(" ", "0"));
    }
}


