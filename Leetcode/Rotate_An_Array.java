import java.util.*;

public class Rotate_An_Array {
    public static void display(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void reverse(int[] a, int i, int j){
        while(i<j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k<0){
            k=nums.length+k;
        }
        reverse (nums,0,nums.length-k-1);
        reverse (nums,nums.length-k,nums.length-1);
        reverse (nums,0,nums.length-1);
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        int r = scn.nextInt();
        rotate(arr,r);
        display(arr);
    }
}