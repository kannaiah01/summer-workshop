import java.util.ArrayList;
import java.util.Collections;

public class collectionutility {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(java.util.Arrays.asList(1,3,5,6,7,6,8,9,5));
        System.out.println(list);
        Collections.sort(list);
        System.out.println("list after sorting: "+list);
        Collections.shuffle(list);
        System.out.println("list after shuffling: "+list);
        System.out.println("Maximum element of the list: "+Collections.max(list));
        System.out.println("Minimum element of the list: "+Collections.min(list));
        Collections.reverse(list);
        System.out.println("list after reversing: "+list);  
        System.out.println("times of elements 7 is: "+Collections.binarySearch(list, 7));
        System.out.println("times of elements 6 is: "+Collections.frequency(list, 6));
        
    }
}
