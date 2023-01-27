package LeetCode.Medium;

public class AddTwoNums {
    public static void convertToBinary(int num, StringBuilder binaryString) {
        int currentBase = 512;
        while(currentBase >= 1) {
            if (num>=currentBase) {
                binaryString.append("1");
                num -= currentBase;
            } else {
                binaryString.append("0");
            }
            currentBase = currentBase/2;
        }
    }

    public static String addBinary(String aBin, String bBin) {
        boolean carry = false;
        StringBuilder totalSum = new StringBuilder();

        for (int i=0; i<12; i++) {
            char aCharInQ = aBin.charAt(11-i);
            char bCharInQ = bBin.charAt(11-i);

            if (carry) {
                if ((aCharInQ == '1' && bCharInQ == '0') || (aCharInQ == '0' && bCharInQ == '1')) {
                    totalSum.append("0");
                } else if ((aCharInQ == '1' && bCharInQ == '1')) {
                    totalSum.append("1");
                } else {
                    totalSum.append("1");
                    carry= false;
                }
            } else {
                if ((aCharInQ == '1' && bCharInQ == '0') || (aCharInQ == '0' && bCharInQ == '1')) {
                    totalSum.append("1");
                } else if ((aCharInQ == '1' && bCharInQ == '1')) {
                    totalSum.append("0");
                    carry = true;
                } else {
                    totalSum.append("0");
                }
            }
        }

        totalSum.reverse();
        return totalSum.toString();
    }

    public static String twosCompliment(StringBuilder binaryString) {
        StringBuilder twosCompStringBuilder = new StringBuilder();
        for (int i=0; i<binaryString.toString().length(); i++) {
            if (binaryString.toString().charAt(i) == '1') twosCompStringBuilder.append("0");
            else twosCompStringBuilder.append("1");
        }
        return addBinary(twosCompStringBuilder.toString(), "000000000001");
    }

    public static int convertToDecimal(String binaryString) {
        int decimal = 0;
        int base = 1;
        for (int i=0; i<11; i++) {
            if (binaryString.charAt(11-i) == '1') decimal += base;
            base *= 2;
        }
        return decimal;
    }

    public static int getSum(int a, int b) {
        StringBuilder aBinaryString = new StringBuilder("00");
        StringBuilder bBinaryString = new StringBuilder("00");
        boolean bothNegative = false;
        boolean aIsNegative = false;
        boolean bIsNegative = false;
        if (a<0 || b<0) {
            if (a<0 && b<0) {
                bothNegative = true;
                a *= -1;
                b *= -1;
            } else {
                aIsNegative = (a<0);
                bIsNegative = (b<0);
            }
        }


        if (aIsNegative) a *= -1;
        if (bIsNegative) b *= -1;
        convertToBinary(a, aBinaryString);
        convertToBinary(b, bBinaryString);

        String aFinalBinString = (aIsNegative) ? twosCompliment(aBinaryString) : aBinaryString.toString();
        String bFinalBinString = (bIsNegative) ? twosCompliment(bBinaryString) : bBinaryString.toString();

        String finalBinSum = addBinary(aFinalBinString, bFinalBinString);

        boolean finalSumNeg = false;
        if (finalBinSum.charAt(0) == '1') {
            finalSumNeg = true;
            StringBuilder finalSumTwos = new StringBuilder();
            finalSumTwos.append("0");
            for (int i=1; i<12; i++) {
                finalSumTwos.append(finalBinSum.charAt(i));
            }
            System.out.println(finalSumTwos);
            finalBinSum = twosCompliment(finalSumTwos);
            finalBinSum = "0" + finalBinSum.substring(1);
            System.out.println(finalBinSum);
        }

        int finalSum = convertToDecimal(finalBinSum);
        if (bothNegative || finalSumNeg) finalSum *= -1;

        return finalSum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(-4, 0));
    }
}
