package com.ryspie.testinggitrepo.zzzztestingrepogit;

import java.util.List;

class Testing_branch_3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        numbers.stream()
                .map(number -> number *2 )
                .forEach(System.out::println);
    }
}
