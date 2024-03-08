package march_7;

import java.util.*;

public class meeting_rooms {
    public static void main(String[] args) {

        int[][] arr = {{7,10}, {2,4}, {15,20}};

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));
        for(int i = 0; i < 2; i++){
            if(arr[i][1] > arr[i+1][0]) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");

    }
}
