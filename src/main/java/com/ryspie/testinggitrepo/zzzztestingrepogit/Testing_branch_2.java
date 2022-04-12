package com.ryspie.testinggitrepo.zzzztestingrepogit;

import java.util.List;

class Testing_branch_2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .map(number -> number *2 )
                .forEach(System.out::println);
    }
}
