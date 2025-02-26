import java.util.Arrays;
import java.util.Scanner;

public class TernarySearch {
    public static int search(int[] arr,int target,int low,int high)
    {
        while(low<=high)
        {
            int mid1=high * 1/3;
            int mid2=high * 2/3;
            if(target==arr[mid1])
                return mid1;
            if (target==arr[mid2])
                return mid2;
            if(target<arr[mid1])
            {
                high=mid1-1;
            }
            else if(target > arr[mid2]){
                low=mid2+1;
            }
            else{
                low=mid1+1;
                high=mid2-1;
            }

            
        }
        return -1;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Size of array:");
        int high = sc.nextInt();
        arr = new int[high];
        System.out.println("Enter Elements:");
        for (int i = 0; i < high; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        System.out.println("target Element:");
        int target=sc.nextInt();
        System.out.println("strting arr:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
        int index = search(arr, target, 0, high - 1);
        System.out.println("final arr:"+Arrays.toString(arr));
        System.out.println("we found it at:"+index);
    }
}
