

import java.util.*;

public class TowerOfHanoi{
    public static void toh(int n, char source, char auxillary,char destination){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        toh(n-1,source,destination,auxillary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        toh(n-1,auxillary,source,destination);
    }
    public static void main(String[]args){
        int n = 3; // Number of disks
        toh(n, 'A', 'B', 'C');
    }
}
