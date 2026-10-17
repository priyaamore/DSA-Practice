package Array;

public class Swap {

    public static void Swap_No(int arr[]){
        int first = 0, last = arr.length-1;
         while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
       first++;
       last--;
            
            
        }
    }
    public static void main(String[]args){
        int arr[] ={123,345,567,678,789};
      
       Swap_No(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);

       }
       System.out.println(" ");
        
       
    }
    
}
