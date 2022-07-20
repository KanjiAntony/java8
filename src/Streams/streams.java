package Streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {

    public static void main(String[] args) {

        List<Integer> number_list = new ArrayList<Integer>();
        number_list.add(20);
        number_list.add(23);
        number_list.add(30);
        number_list.add(70);
        number_list.add(40);
        number_list.add(50);
        number_list.add(100);
        number_list.add(100);


        //number_list.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));

        //number_list.stream().map(x -> x * 2).forEach(x -> System.out.println(x));

        //number_list.parallelStream().map(x -> x * 2).forEach(x -> System.out.println(x));

//        long num_count = number_list.stream().count();
//
//        System.out.println(num_count+" numbers");

//        Optional<Integer> max_num = number_list.parallelStream().max((i1, i2) -> i1.compareTo(i2));
//
//        System.out.println("Max : "+ max_num.get());

        //ascending order
        //number_list.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(x -> System.out.println(x));

        //descending order
        //number_list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(x -> System.out.println(x));

//        Object[] num_list_obj = number_list.stream()
//                                .collect(Collectors.toSet()).toArray();
//
//        for(Object num : num_list_obj) {
//            System.out.println(num);
//        }

        List<User> users_list = Stream.of(
                new User(1L,"Kanji",3, Arrays.asList("kanjianto@gmail.com","kanjiantonio@gmail.com")),
                new User(2L,"Martin",5, Arrays.asList("martin@gmail.com","martin@yahoo.com"))
        ).collect(Collectors.toList());

        List<String> collected_names = users_list.stream().map(x -> x.getName()).collect(Collectors.toList());

        List<List<String>> mapped_emails = users_list.stream().map(User::getEmail).collect(Collectors.toList());

        System.out.println(mapped_emails);

        //use of flatmap
        List<String> flat_mapped_emails = users_list.stream().flatMap(u -> u.getEmail().stream()).collect(Collectors.toList());

        System.out.println(flat_mapped_emails);

        System.out.println("------------------------------");

        charOccurenceDSAlgo();
        charOccurence();

        System.out.println("------------------------------");

        highestCars(users_list);

    }

    // this is a sample of how it can be done using sets, maps and for loop resulting in a time complexity of O(n)
    static void charOccurenceDSAlgo() {

        String name = "Kanjiii".toLowerCase();
        Set<Character> result_set = new HashSet<>();
        Map<Character,Integer> result_map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            //int initial = 1+i;

            if(!result_set.contains(name.charAt(i))) {
                result_set.add(name.charAt(i));
                result_map.put(name.charAt(i),1);
            } else {
                int initial = result_map.get(name.charAt(i));
                result_map.put(name.charAt(i),initial+1);
            }

        }

        System.out.println("Result map using sets : "+result_map);

    }

    // how to use java 8 streams
    static void charOccurence() {

        String name = "Kaanji";

        Map<String, Long> result_map = Arrays.stream(name.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println("Result map using java 8 : "+result_map);

    }

    static void highestCars(List<User> users_list ) {

        User user_cars = users_list.stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(User::getCars)),
                                Optional::get
                        )
                );

        System.out.println(user_cars.toString());

    }
}
