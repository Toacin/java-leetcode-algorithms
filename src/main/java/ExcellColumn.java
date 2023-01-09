//public class ExcellColumn {
//    public String convertToTitle(int columnNumber) {
//        StringBuilder finalColumn = new StringBuilder();
//        if (columnNumber<27) return (convertToExcelCharOne(columnNumber));
//
//        while(columnNumber>0) {
//            int remainder = columnNumber%27;
//            String remainderLetter = switch(remainder) {
//                case 1 -> "A";
//                case 2 -> "B";
//                case 3 -> "C";
//                case 4 -> "D";
//                case 5 -> "E";
//                case 6 -> "F";
//                case 7 -> "G";
//                case 8 -> "H";
//                case 9 -> "I";
//                case 10 -> "J";
//                case 11 -> "K";
//                case 12 -> "L";
//                case 13 -> "M";
//                case 14 -> "N";
//                case 15 -> "O";
//                case 16 -> "P";
//                case 17 -> "Q";
//                case 18 -> "R";
//                case 19 -> "S";
//                case 20 -> "T";
//                case 21 -> "U";
//                case 22 -> "V";
//                case 23 -> "W";
//                case 24 -> "X";
//                case 25 -> "Y";
//                case 26 -> "Z";
//            };
//            finalColumn.insert(0, String.valueOf(remainder));
//            columnNumber = columnNumber/27;
//        }
//
//        return ;
//    }
//
//    public static String convertToExcelCharOne(int remainder) {
//        String remainderLetter = switch(remainder) {
//            case 1 -> "A";
//            case 2 -> "B";
//            case 3 -> "C";
//            case 4 -> "D";
//            case 5 -> "E";
//            case 6 -> "F";
//            case 7 -> "G";
//            case 8 -> "H";
//            case 9 -> "I";
//            case 10 -> "J";
//            case 11 -> "K";
//            case 12 -> "L";
//            case 13 -> "M";
//            case 14 -> "N";
//            case 15 -> "O";
//            case 16 -> "P";
//            case 17 -> "Q";
//            case 18 -> "R";
//            case 19 -> "S";
//            case 20 -> "T";
//            case 21 -> "U";
//            case 22 -> "V";
//            case 23 -> "W";
//            case 24 -> "X";
//            case 25 -> "Y";
//            default -> "Z";
//        };
//        return remainderLetter;
//    }
//}
