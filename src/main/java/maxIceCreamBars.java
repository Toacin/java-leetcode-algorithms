import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxIceCreamBars {
    public static int maxIceCream(int[] costs, int coins) {
        List<Integer> costsList = new ArrayList<Integer>();

        for (int priceOfBar: costs) {
            costsList.add(priceOfBar);
        }

        List<Integer> sortedCostsList = sortArray(costsList);

        int [] sortedCostsArray = new int[sortedCostsList.size()];
        for(int i=0; i<sortedCostsList.size(); i++) {
            sortedCostsArray[i] = sortedCostsList.get(i);
        }

        int barsPurchaseable = 0;
        for (int priceOfBar: sortedCostsArray) {
            if (priceOfBar<=coins) {
                barsPurchaseable++;
                coins = coins-priceOfBar;
                continue;
            } else {
                return barsPurchaseable;
            }
        }

        return barsPurchaseable;
    }

    public static List<Integer> sortArray(List<Integer> unsortedArray) {
        if (unsortedArray.size()<=1) return unsortedArray;

        int pivotPointIndex = (int) (Math.random() * unsortedArray.size());
        int pivotPoint = unsortedArray.get(pivotPointIndex);
        unsortedArray.remove(pivotPointIndex);

        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();

        for (int entry: unsortedArray) {
            if (entry<pivotPoint) leftArray.add(entry);
            else rightArray.add(entry);
        }

        List<Integer> sortedLeft = sortArray(leftArray);
        sortedLeft.add(pivotPoint);
        List<Integer> sortedRight = sortArray(rightArray);
        sortedLeft.addAll(sortedRight);

        return sortedLeft;
    }

    public static void main(String[] args) {
        List<Integer> randomLargeArray = new ArrayList<Integer>();
        for (int i=0; i<200; i++) {
            int randomNumber = (int) (Math.random()*100);
            randomLargeArray.add(randomNumber);
        }
        System.out.println(sortArray(randomLargeArray));
    }
}
