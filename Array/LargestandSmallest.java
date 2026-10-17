package Array;

public class largeat_no {

    public static int largestNo(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];

            }
            if(arr[i] < smallest ){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is " + smallest);
        return largest;
    }
    public static void main(String[]args){
        int arr[] = {1,4,5,6,8,2,34,5,6};
        System.out.print("The greater element is"+largestNo(arr));

    }
    
}
