/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author ksramirez
 */
public class SelectionSort {
       public static void main(String[] args) {
        int[] arr={8,0,2,1,5};
        int temp=0;
        System.out.print("Array content = ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println("");
        }
        System.out.print("Ascending = ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        
    } 
}
