package march_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class arrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Initial List: ");
        for(Integer element: list){
            System.out.print(element+" ");
        }
        System.out.println();
        list.remove(1);
        for(Integer element: list){
            System.out.print(element+" ");
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +" ");
        }
    }
}
