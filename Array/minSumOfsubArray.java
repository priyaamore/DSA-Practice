package Array;

public class maxSubSum {
    public static void maxSumSubarray(int arr[]){
        
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum = 0;
                for(int k =i;k<=j;k++){
                    currSum += arr[k];

                }
                System.out.println(currSum);
                if(minSum>currSum){
                   minSum = currSum ;
                }
            }
        }
        System.out.println("Maximun sum of the subarray" +"="+ minSum);

    }
    public static void main(String[]args){
        int arr[] = {1,-2,6,-1,8};
        maxSumSubarray(arr);
    }
    
}
