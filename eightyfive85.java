// MultiDimensional ArrayList

import java.util.*;
public class eightyfive85 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i*1);  // 1 2 3 4 5
            list2.add(i*2);  // 2 4 6 8 10
            list3.add(i*3);  // 3 6 9 12 15
        }

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        // nested loops
        for (int j = 0; j < mainlist.size(); j++) {
            ArrayList<Integer> currlist = mainlist.get(j);
            for (int i = 0; i < currlist.size(); i++) {
                System.out.print(currlist.get(i)+ " ");
            }
            System.out.println();
        }

    }
}
