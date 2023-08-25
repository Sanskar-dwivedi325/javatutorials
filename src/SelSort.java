import java.util.*;




public class SelSort {
    public static void main(String[] args){
        int[] arr={2,4,3,6,7};
        int n=arr.length;
        for(int i=0; i<n-1; i++){ // Hepresent the current Ind

            int min_index = i;
            for(int j=i+1; j < n; j++){

                if (arr[j] < arr[min_index]){

            min_index=j;}}
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

