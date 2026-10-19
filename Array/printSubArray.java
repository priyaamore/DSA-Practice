package Array;

public class SubArrarys {
    public static void printSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){ //print
                for(int k=i;k<=j;k++){ //subarray
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int arr[]  = {2,4,6,8,10};
        printSubArray(arr);
    }
    
}
