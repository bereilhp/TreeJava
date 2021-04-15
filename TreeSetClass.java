import java.util.*;

public class TreeSetClass{

    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("Hello");
        treeSet.add("World");

        treeSet.add("World"); //Duplicates dont get added

        System.out.println(treeSet);
        System.out.println(treeSet.size());

        System.out.println(treeSet.contains("Hello"));

    }
}

