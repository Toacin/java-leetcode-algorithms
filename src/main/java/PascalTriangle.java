import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
//        return array;
        List<List<Integer>> returnArray = new ArrayList<>();

//        Array list for first row;
        List<Integer> row1 = new ArrayList<Integer>();
        row1.add(1);
        returnArray.add(row1);
        if (numRows == 1) return returnArray;

//        Appending Array list for every row thereafter
        for (int iterations = 0; iterations<numRows-1; iterations++) {
            List<Integer> nextRow = new ArrayList<Integer>();
            nextRow.add(1);
            for(int i=0; i<returnArray.get(iterations).size()-1; i++) {
                nextRow.add(returnArray.get(iterations).get(i) + returnArray.get(iterations).get(i+1));
            }
            nextRow.add(1);
            returnArray.add(nextRow);
        }

        return  returnArray;
    }
}
