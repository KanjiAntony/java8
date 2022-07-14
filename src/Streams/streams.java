package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    }
}
