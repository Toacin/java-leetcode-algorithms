package LeetCode.Easy;

public class squareRoote {
    static public int mySqrt(int x) {
        long lowPoint = 0;
        long highPoint = x/2;

        while(lowPoint<=highPoint) {
            long midpoint=(highPoint+lowPoint)/2;

            if (midpoint*midpoint<=x && x<(midpoint+1)*(midpoint+1)) {
                return (int) midpoint;
            } else if (x<(midpoint+1)*(midpoint+1)) {
                highPoint = midpoint-1;
            } else {
                lowPoint = midpoint+1;
            }
        }

        return (int) lowPoint;
//        if (x==0) return 0;
//        if (x==1) return 1;
//        for (long i=0; i<(x/2)+1; i++) {
//            if (i*i==x) {
//                return (int) i;
//            } else if (i*i>=x) {
//                return (int) i-1;
//            }
//        }
//        return x/2;
    }

    static public void main(String[] args) {
        System.out.println(mySqrt(2));
    }
}
