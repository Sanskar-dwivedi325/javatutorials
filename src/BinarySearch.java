import java.util.*;

class srray{
    Scanner sc=new Scanner(System.in);
    void setelements(int[] arr , int size){
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }

    void getelements(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    int binsearch(int[] arr,int size,int key){
        //s=start  // l=end index
        int s=0,l=size-1,mid=(s+l)/2;
        while (s<=l){
            if(arr[mid]==key){
                return mid;
            }

            if(key<arr[mid]){
                l=mid-1;
            }

            else{
                s=mid+1;
            }
            mid=(s+l)/2;
        }
        return -1;
    }

}
public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter the elements");
        srray obj4 = new srray();
        obj4.setelements(arr, 5);
        obj4.getelements(arr, 5);

        System.out.println("enter the number you want to search");
        int key= sc.nextInt();
        System.out.println(obj4.binsearch(arr,5,key));


    }

}
