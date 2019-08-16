package java.com.Hqinjun.Leetcode;

public class Solution_leet4 {

    //头大看的，接替思路是将2个数组拼接成一个有序的数集合，通过中位数的特点以及一些如何拼接成一个集合思路。
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen -i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect

                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

//    public double findMedianSortedArrays2(int[] A, int[] B) {
//        int a = A.length;
//        int b = B.length;
//        int temp = 0;
//        double c = 0.0;
//        List<Integer> leet = new ArrayList<Integer>();
//        if()
//
//    }

    public static void main(String[] args) {
        int[] a = {1,3};
        int[] b = {1,4,6};
        Solution_leet4 solution_leet4 = new Solution_leet4();
        System.out.println(solution_leet4.findMedianSortedArrays(a,b));
    }
}
