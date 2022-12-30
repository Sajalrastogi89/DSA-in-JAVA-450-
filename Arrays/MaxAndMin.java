package Arrays;
public class MaxAndMin{
    public static void main(String[] args) {
        int[] A={1,2,3,1,2,5,6,3,5,2,8,7,5,2};
        int Max=A[0];
        int Min=A[0];
        for(int i=1;i<A.length;i++){
           Max= Math.max(Max,A[i]);
           Min= Math.min(Min,A[i]);}
        System.out.println("Max:"+Max);
        System.out.println("Min:"+Min);
    }
}