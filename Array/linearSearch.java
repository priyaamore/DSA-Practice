package Array;

public class Linear_search {

    public static int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
          
        }
          return -1;

    }
    public static void main (String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 9;

       int index = linearSearch(arr, key);
       if(index == -1){
        System.out.print("Not Found");
       }else{
        System.out.println("It is found at" + " " + index);
       }
        
    }
    
}
