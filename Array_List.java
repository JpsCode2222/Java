import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args){
        // Declear ArrayList
        ArrayList <Integer> list = new ArrayList<>();
        // .add() | .size() | .get() | 
        list.add(0);
        list.add(1); 
        System.out.println(list.size());
        System.out.println(list);      
        
        // Add ele between 
        list.add(2,2);
        System.out.println(list);

        // Get ele of index
        int ind1 = list.get(1);
        System.out.println(ind1);

        // set ele at specific index
        list.set(0,100);
        System.out.println(list);

        // Remove specific ele using index
        list.remove(2);
        System.out.println(list);

        // Loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
