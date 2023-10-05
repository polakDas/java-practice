package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String name = "Something";

        Random rand = new Random();
        List<Integer> ages = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            ages.add(rand.nextInt(20, 40));
        }
        System.out.println(ages);

        ages.stream().filter(n -> n > 30).forEach(n -> System.out.println(n));
//        ages.forEach(n -> System.out.println(n));
//        System.out.println();
//        for(int i: ages) {
//            System.out.println(i);
//        }

        List<Integer> sAge = ages.stream().filter(n -> n % 2 == 1).sorted().toList();
        List<Integer> mutableSAge = new ArrayList<>(sAge);
        List<Integer> sortedOddAges = ages.stream().map(n -> n % 2 == 1 ? mutableSAge.remove(0) : n).toList();
        System.out.println(sortedOddAges);

    }
}
