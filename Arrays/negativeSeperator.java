package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

class negativeSeparator {
    
    public static void main(String[] args)
    {
        // Your code goes here
        int[] arr={1,-1,3,2,-7,-5,11,6};
        int n=arr.length;
        ArrayList<Integer> a=new ArrayList<Integer>();
for(int i=0;i<n;i++){
    if(arr[i]>0){
        a.add(arr[i]);
    }
}     
for(int i=0;i<n;i++){
    if(arr[i]<0){
         a.add(arr[i]);
    }
}
for(int i=0;i<n;i++){
    arr[i]=a.get(i);
}
System.out.println(Arrays.toString(arr));
    }
}
