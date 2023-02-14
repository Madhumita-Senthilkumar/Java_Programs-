//Given an array of distinct integers. 
//The task is to count all the triplets such that sum of two elements equals the third element.
//==========Its a geeksforgeeks problem =============
//Input: 
//N = 4 
//arr[] = {1, 5, 3, 2}
//Output: 2 
//Explanation: There are 2 triplets:
 //1 + 2 = 3 and 3 +2 = 5

package javaapplication18;
import java.util.*;
public class JavaApplication18 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         int arr[]=new int[n];
        
        for(int b=0;b<n;b++)
        {
            arr[b]=sc.nextInt();
            System.out.print("\n");
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=arr[i]+arr[j];
                for(int k=0;k<n;k++)
                {
                    if(sum==arr[k])
                    {
                    count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
