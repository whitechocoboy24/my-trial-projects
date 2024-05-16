/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;

public class JavaApplication9 {
    void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min_indx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_indx])
                {
                    min_indx=j;
                }
            }
            int temp=arr[min_indx];
            arr[min_indx]=arr[i];
            arr[i]=temp;
        }
    }
    void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    
     public static void main(String[] args) {
       
         JavaApplication9 obj = new JavaApplication9();
         int arr[]={64,25,12,22,11};
         obj.sort(arr);
         System.out.println("Sorted array");
         obj.printArray(arr);
         
    }
    
}
