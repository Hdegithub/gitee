package com.learn.d15;

import java.util.ArrayList;
import java.util.List;

public class MovieTest {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        Movie movie = new Movie("唐人街探案", 8.5, "王宝强,刘昊然");
        movieList.add(movie);
        movieList.add(new Movie("《你好，李焕英》", 9.5, "张小斐,贾玲,沈腾,陈赫"));
        movieList.add(new Movie("《刺杀小说家》", 8.6, "雷佳音,杨幂"));
        movieList.forEach((movie1) -> {
            System.out.println(movie1);
        });
    }
}
