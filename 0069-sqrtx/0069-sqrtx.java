class Solution {
    public int mySqrt(int x) {
        if (x==0 || x==1) return x;
        int max = x;
        int min = 0;
        int mid;
        Long squr;
        while (true) {
            mid = (max + min)/2;
            System.out.println(mid);
            squr = (long)mid*mid;
            if (squr == x || mid == min) {
                return mid;
            } else if (squr > x) {
                max = mid;
            } else if (squr < x) {
                min = mid;
            }
        }
    }
}