package Array;

public class PairArr {

    public static void PossiblePair(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            // int curr = arr[i];
            for(int j=i+1;j<arr.length-1;j++){
                System.out.print("("+arr[i]+","+arr[j] +")");
               
            }
            System.out.println("");
        }

    }
    public static void main(String[]args){
        int arr[] = {3,4,5,6,8,2,4,5,6,8,9};
        PossiblePair(arr);

    }
    
}
