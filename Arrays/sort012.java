package Arrays;
import java.util.Arrays;

public class sort012
{
    public static void main(String[] args)
    {
        // code here 
        int[] a={0,0,1,2,2,1,0,0,2};
int n=a.length;
         int f=0,l=n-1,p=0;
       while(p<=l){
            if(a[p]==0){
                int temp=a[p];
                a[p]=a[f];
                a[f]=temp;
                f++;
                p++;
            }
            else if(a[p]==1){
                p++;
            }
            else{
                int temp=a[p];
                a[p]=a[l];
                a[l]=temp;
               
                l--;
               
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
    
}
