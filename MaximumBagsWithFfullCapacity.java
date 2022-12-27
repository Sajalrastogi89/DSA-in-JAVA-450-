
// Maximum bags with full capacity ->

import java.util.*;
class HelloWorld {
    public static void MaximumBagsWithFullCapacity(String[] args) {
        int[] capacity={91,54,63,99,24,45,78};
        int[] rocks={35,32,45,98,6,1,25};
        int additionalRocks=17;
       int n=capacity.length;
      
        int sum=0,j=0;
        for(int i=0;i<n;i++){
            capacity[i]=capacity[i]-rocks[i];
            
        }
        Arrays.sort(capacity);
        for(j=0;j<n;j++){
     sum=sum+capacity[j];
     if(sum>additionalRocks){
         System.out.println(j);
         break;
     }
        }
        if(j==n){
     System.out.println(n);
    }
    }
}