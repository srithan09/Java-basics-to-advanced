import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OptimalApproach {

 public static List<Integer> TwoSumOptimal(int[] arr, int k) {
    List<Integer> res = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
        int a = arr[i];
        int more = k - a;

        if (map.containsKey(more)) {
            res.add(map.get(more));
            res.add(i);
            return res;
        }

        map.put(a, i);
    }

    return res;
}


    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        List<Integer> result = new ArrayList<>();
        result = TwoSumOptimal(arr, target);
        System.out.println(result);
    }
}
