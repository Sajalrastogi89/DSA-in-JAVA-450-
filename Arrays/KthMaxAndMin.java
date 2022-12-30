package Arrays;
import java.util.Arrays;

public class KthMaxAndMin {
    public static void main(String[] args) {
        int K=2;
        int[] A={1,4,3,2,6,5,6,7,8};
        int n=A.length;
        Arrays.sort(A);
System.out.println(A[K-1] + " is kth minimum");
System.out.println(A[n-K] +" is Kth maximum");
    }
}
