package CodeWars;

public class RGBtoHex {
    public static String decToHexString(int decDigit) {
        return switch (decDigit) {
            case 15 -> "F";
            case 14 -> "E";
            case 13 -> "D";
            case 12 -> "C";
            case 11 -> "B";
            case 10 -> "A";
            default -> String.valueOf(decDigit);
        };
    }

    public static String rgb(int r, int g, int b) {

        int[] rgbArray =  {r, g, b};
        StringBuilder returnString = new StringBuilder();
        for (int decValue: rgbArray) {
            if (decValue >= 255) {
                returnString.append("FF");
                continue;
            } else if (decValue <= 0) {
                returnString.append("00");
                continue;
            }
            String base1Hex = (decValue>15) ? decToHexString(decValue%16) : decToHexString(decValue);
            String base16Hex = (decValue>15) ? decToHexString(decValue/16) : "0";
            returnString.append(base16Hex+base1Hex);
        }
        return (returnString.toString());
    }

    public static void main (String[] args) {
        System.out.println(rgb(148, 0, 211));
//        System.out.println(rgb(255, 300, 300));
//        System.out.println(decToHex(148));
    }
}
