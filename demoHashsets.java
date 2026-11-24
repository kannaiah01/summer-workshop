import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class demoHashsets {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Mango");
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Mango");
        System.out.println("Hashset: "+hs);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Mango");
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Mango");
        System.out.println("linkedHashset: "+lhs);

        
        TreeSet<String> ths=new TreeSet<>();
        ths.add("Mango");
        ths.add("Apple");
        ths.add("Banana");
        ths.add("Mango");
        System.out.println("TreeSet: "+ths);
        LinkedHashSet<Integer> lhs1=new LinkedHashSet<>();
        lhs1.add(12);   
        lhs1.add(13);
        lhs1.add(14);
        System.out.println("linkedHashset: "+lhs1); 
        TreeSet<Integer> ths1=new TreeSet<>();
        ths1.add(12);
        ths1.add(13);
        ths1.add(14);
        System.out.println("TreeSet: "+ths1);
        lhs1.remove(13);
        System.out.println("linkedHashset after remove: "+lhs1);


        
    }
}