import java.util.ArrayList;
import java.util.HashSet;

public class basicoperations {
    public static void main(String [] args){
        ArrayList<String> list=new ArrayList();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("grape");  
        list.add("orange");
        System.out.println(list);
        list.remove("banana");
        System.out.println(list);
        list.set(2, "blueberry");
        System.out.println(list);   
        list.isEmpty();
        System.out.println(list.isEmpty());

        ArrayList<Integer> list1=new ArrayList<Integer>(java.util.Arrays.asList(1,3,4,6,7,7,8,6,8,9,6,3));
        System.out.println("original list: "+list1);
        ArrayList<Integer> newList = new ArrayList<>(new HashSet<>(list1));
        System.out.println("list after removing duplicates: "+newList);

        String sentence =" the java is the progamming language and the java is the best language in the world and the java is the most popular language in the world";
        String[] words = sentence.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println("Unique words: " + uniqueWords);
        
    }
    
}
