import java.util.ArrayList;

public class MultiDimDynamic {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());


       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            list.get(i).add((int)(Math.random()*100));
        }
        
       }

       System.out.println(list);
    }
    
}
