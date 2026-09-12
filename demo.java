import java.util.*;

public class demo {
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        //adding data
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // System.out.println(list);

        // getting data 
        int n=list.get(0);
        System.out.println(n);
        n=list.get(4);
        System.out.println(n);
        n=list.get(3);
        System.out.println(n);

        //setting data
        list.set(0, 100);
        System.out.println(list);
         
        // sort in ascending order
        Collections.sort(list);  // here Collections is a class it also need to import
        System.out.println();
        System.out.println("Ascending order arrayList: "+list);
        // sort in decending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println();
        System.out.println("Decelding order arraylist: "+list);

    }
}
