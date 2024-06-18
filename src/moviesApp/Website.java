package moviesApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Website {
    public static void main(String[] args) {
        // Scanner: Search By: 1) genre, 2) director, 3) year, 4) is for children, 5) exit.... print movies and keep showing menu till user exits
        // 1 -> which genre? - Drama : Movies found with given genre: print movies
    // 2 -> which director? - Nolan : Movies found with given dir: print movies
    // 3
    // 4 - > Movies for children : print movies
    // 5 -> Thanks for using Movies app
        System.out.println("Search by:");
        System.out.println("1) genre");
        System.out.println("2) director");
        System.out.println("3) year");
        System.out.println("4) is for children");
        Scanner input = new Scanner(System.in);


       // for (Movie m : Database.provide()){
        //    System.out.println(m);
//        List<Movie> movies = searchByGenre("drama");
//        print(movies);
//        List<Movie> dirMovies = searchByDirector("a");
//        print(dirMovies);
        List<Movie> yearMovies = searchByYearRange(2015,2000);
        print(yearMovies);
    }
    public static void print (List<Movie> movies){
        int num = 1;
        for (Movie m : movies){
            System.out.println(num+".) "+m);
            num++;
        }
//        movies.stream()
//                .forEach(movie -> System.out.println(movie));
    }
    public static List<Movie> searchByYearRange(int year1, int year2){
        return Database.provide().stream()
                .filter(movie -> movie.getReleaseYear()>=year1&&movie.getReleaseYear()<=year2)
                .collect(Collectors.toList());
    }
    public static List<Movie> searchByDirector (String dirName){
//        ArrayList<Movie> dirList = new ArrayList<>();
//        for (Movie m: Database.provide()){
//            if (m.getDirector().contains(dirName)){
//                dirList.add(m);
//            }
//        }
//        return dirList;
        return Database.provide().stream()
                .filter(movie -> movie.getDirector().contains(dirName))
                .collect(Collectors.toList());
    }
    public static List<Movie> searchByGenre (String genre){
//        ArrayList<Movie> genreList = new ArrayList<>();
//        for (Movie m : Database.provide()){
//            if (m.getGenre().equalsIgnoreCase(genre)){
//                genreList.add(m);
//            }
//        }
//        return genreList;
        return Database.provide().stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }
}
