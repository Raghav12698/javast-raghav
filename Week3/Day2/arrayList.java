import java.util.*;
public class arrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr=new ArrayList<>(2);
        System.out.println(arr.size());
        //add elements
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        System.out.println(arr.size());
        // access
        System.out.println(arr.get(0));
        System.out.println(arr.get(3));
        //remove
        System.out.println(arr.remove(0));
        System.out.println(arr.get(0));
        //update
        System.out.println(arr.set(0,10));
        System.out.println(arr);
        //sorting
        Collections.sort(arr);
        System.out.println(arr);

    }
}
