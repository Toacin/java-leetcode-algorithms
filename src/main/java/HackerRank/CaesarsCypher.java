package HackerRank;

public class CaesarsCypher {
    public static String caesarCipher(String s, int k) {
        // Write your code here

        // decrease the amount of rotations (1 rotation is the same as 26 rotations)
        int rotationCount = k;
        while (rotationCount>=26) rotationCount -= 26;

        // create an array list of the entire alphabet for use later
        String[] alphabetList = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        // initialize the final string to be returned
        StringBuilder rotatedString = new StringBuilder();

        // iterate through the length of the string
        for (int i=0; i<s.length(); i++) {
            // check if the character is capital or lowercase
            boolean isCapital = String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i)).toUpperCase());
            String characterInQuestion = String.valueOf(s.charAt(i)).toLowerCase();

            // find the index at which the character would appear in the alphabet array
            int startingIndex = switch(characterInQuestion) {
                case "a" -> 0;
                case "b" -> 1;
                case "c" -> 2;
                case "d" -> 3;
                case "e" -> 4;
                case "f" -> 5;
                case "g" -> 6;
                case "h" -> 7;
                case "i" -> 8;
                case "j" -> 9;
                case "k" -> 10;
                case "l" -> 11;
                case "m" -> 12;
                case "n" -> 13;
                case "o" -> 14;
                case "p" -> 15;
                case "q" -> 16;
                case "r" -> 17;
                case "s" -> 18;
                case "t" -> 19;
                case "u" -> 20;
                case "v" -> 21;
                case "w" -> 22;
                case "x" -> 23;
                case "y" -> 24;
                case "z" -> 25;
                default -> -50;
            };

            // add rotation amount to the index, if index is out of bounds of alphabet, start back from index 0 (or the letter "a")
            int finalIndex = startingIndex + rotationCount;
            while (finalIndex>25) finalIndex -= 26;

            // new character is value from the alphabet array @ final index which accounts for rotation. If number is negative, that means it's not part of alphabet array;
            String newCharacter = (finalIndex < 0) ? characterInQuestion : alphabetList[finalIndex];

            // capitalize letter if boolean capital is true;
            if (isCapital) rotatedString.append(newCharacter.toUpperCase());
            else rotatedString.append(newCharacter);
        }

        return rotatedString.toString();
    }
}
