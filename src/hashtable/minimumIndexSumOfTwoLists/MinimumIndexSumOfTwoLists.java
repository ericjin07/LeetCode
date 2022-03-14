package hashtable.minimumIndexSumOfTwoLists;

import java.util.*;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<>();
        int min_sum = Integer.MAX_VALUE, sum;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                sum = i + map.get(list2[i]);
                if (sum < min_sum) {
                    min_sum = sum;
                    res.clear();
                    res.add(list2[i]);
                } else if (sum == min_sum) {
                    res.add(list2[i]);
                }
            }
        }

        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[]{"KFC","Burger King","Tapioca Express","Shogun"};
        String[] restaurant = new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2);
        System.out.println(Arrays.toString(restaurant));
    }
}
