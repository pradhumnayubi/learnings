package march_7;

import java.util.*;

public class k_most_occuring {

    static void solve(int[] arr, int n, int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(mp.entrySet());


        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return o2.getKey() - o1.getKey();
                } else return o2.getValue() - o1.getValue();
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i).getKey()+" ");
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        solve(arr,n,k);
    }
}
