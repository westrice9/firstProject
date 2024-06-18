package moviesApp;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Movie> provide(){
        // Create an ArrayList to store Movie objects
        ArrayList<Movie> movies = new ArrayList<>();

        // Create Movie objects individually
        Movie movie1 = new Movie("The Shawshank Redemption", 9.3, "Frank Darabont", 15.99, "Drama", false, 1994);
        Movie movie2 = new Movie("The Godfather", 9.2, "Francis Ford Coppola", 12.75, "Crime", false, 1972);
        Movie movie3 = new Movie("The Dark Knight", 9.0, "Christopher Nolan", 18.50, "Action", false, 2008);
        Movie movie4 = new Movie("Pulp Fiction", 8.9, "Quentin Tarantino", 14.25, "Crime", false, 1994);
        Movie movie5 = new Movie("Fight Club", 8.8, "David Fincher", 11.99, "Drama", false, 1999);
        Movie movie6 = new Movie("Forrest Gump", 8.8, "Robert Zemeckis", 13.50, "Drama", false, 1994);
        Movie movie7 = new Movie("The Matrix", 8.7, "Lana Wachowski, Lilly Wachowski", 16.00, "Action", false, 1999);
        Movie movie8 = new Movie("Goodfellas", 8.7, "Martin Scorsese", 14.75, "Crime", false, 1990);
        Movie movie9 = new Movie("Schindler's List", 8.9, "Steven Spielberg", 17.25, "Biography", false, 1993);
        Movie movie10 = new Movie("Inception", 8.8, "Christopher Nolan", 19.99, "Action", false, 2010);
        Movie movie11 = new Movie("Titanic", 7.8, "James Cameron", 16.99, "Romance", false, 1997);
        Movie movie12 = new Movie("Braveheart", 8.3, "Mel Gibson", 14.50, "Biography", false, 1995);
        Movie movie13 = new Movie("Gladiator", 8.5, "Ridley Scott", 15.25, "Action", false, 2000);
        Movie movie14 = new Movie("The Silence of the Lambs", 8.6, "Jonathan Demme", 13.99, "Crime", false, 1991);
        Movie movie15 = new Movie("The Departed", 8.5, "Martin Scorsese", 16.50, "Crime", false, 2006);
        Movie movie16 = new Movie("The Lord of the Rings: The Fellowship of the Ring", 8.8, "Peter Jackson", 18.75, "Adventure", false, 2001);
        Movie movie17 = new Movie("The Avengers", 8.0, "Joss Whedon", 17.00, "Action", false, 2012);
        Movie movie18 = new Movie("Interstellar", 8.6, "Christopher Nolan", 19.25, "Sci-Fi", false, 2014);
        Movie movie19 = new Movie("Jurassic Park", 8.1, "Steven Spielberg", 15.75, "Adventure", false, 1993);
        Movie movie20 = new Movie("Back to the Future", 8.5, "Robert Zemeckis", 14.99, "Adventure", false, 1985);
        Movie movie21 = new Movie("The Lion King", 8.5, "Roger Allers, Rob Minkoff", 13.50, "Animation", true, 1994);
        Movie movie22 = new Movie("Toy Story", 8.3, "John Lasseter", 12.25, "Animation", true, 1995);
        Movie movie23 = new Movie("Finding Nemo", 8.1, "Andrew Stanton", 11.99, "Animation", true, 2003);
        Movie movie24 = new Movie("Up", 8.2, "Pete Docter", 14.50, "Animation", true, 2009);
        Movie movie25 = new Movie("Frozen", 7.4, "Chris Buck, Jennifer Lee", 13.75, "Animation", true, 2013);
        Movie movie26 = new Movie("Harry Potter and the Sorcerer's Stone", 7.6, "Chris Columbus", 16.00, "Fantasy", true, 2001);
        Movie movie27 = new Movie("Star Wars: Episode IV - A New Hope", 8.6, "George Lucas", 18.25, "Sci-Fi", false, 1977);
        Movie movie28 = new Movie("Avatar", 7.8, "James Cameron", 19.50, "Action", false, 2009);
        Movie movie29 = new Movie("The Incredibles", 8.0, "Brad Bird", 15.99, "Animation", true, 2004);
        Movie movie30 = new Movie("Casablanca", 8.5, "Michael Curtiz", 12.75, "Drama", false, 1942);
        Movie movie31 = new Movie("The Great Gatsby", 7.2, "Baz Luhrmann", 13.50, "Drama", false, 2013);
        Movie movie32 = new Movie("The Notebook", 7.8, "Nick Cassavetes", 11.99, "Romance", false, 2004);
        Movie movie33 = new Movie("Gone with the Wind", 8.1, "Victor Fleming", 16.25, "Drama", false, 1939);
        Movie movie34 = new Movie("The Sound of Music", 8.0, "Robert Wise", 14.50, "Biography", false, 1965);
        Movie movie35 = new Movie("Pretty Woman", 7.0, "Garry Marshall", 10.75, "Romance", false, 1990);
        Movie movie36 = new Movie("The Social Network", 7.7, "David Fincher", 15.00, "Biography", false, 2010);
        Movie movie37 = new Movie("La La Land", 8.0, "Damien Chazelle", 17.25, "Comedy", false, 2016);
        Movie movie38 = new Movie("The Grand Budapest Hotel", 8.1, "Wes Anderson", 16.50, "Comedy", false, 2014);
        Movie movie39 = new Movie("The Martian", 8.0, "Ridley Scott", 18.99, "Sci-Fi", false, 2015);
        Movie movie40 = new Movie("Gravity", 7.7, "Alfonso Cuarón", 14.75, "Sci-Fi", false, 2013);
        Movie movie41 = new Movie("The Shape of Water", 7.3, "Guillermo del Toro", 13.50, "Fantasy", false, 2017);
        Movie movie42 = new Movie("Birdman", 7.7, "Alejandro G. Iñárritu", 16.25, "Comedy", false, 2014);
        Movie movie43 = new Movie("Black Panther", 7.3, "Ryan Coogler", 17.99, "Action", false, 2018);
        Movie movie44 = new Movie("Mad Max: Fury Road", 8.1, "George Miller", 15.75, "Action", false, 2015);
        Movie movie45 = new Movie("The Revenant", 7.8, "Alejandro G. Iñárritu", 18.50, "Adventure", false, 2015);
        Movie movie46 = new Movie("Joker", 8.4, "Todd Phillips", 19.25, "Crime", false, 2019);
        Movie movie47 = new Movie("1917", 8.3, "Sam Mendes", 18.99, "War", false, 2019);
        Movie movie48 = new Movie("Parasite", 8.6, "Bong Joon Ho", 17.50, "Comedy", false, 2019);
        Movie movie49 = new Movie("Bohemian Rhapsody", 8.0, "Bryan Singer", 16.75, "Biography", false, 2018);
        Movie movie50 = new Movie("A Star Is Born", 7.7, "Bradley Cooper", 15.99, "Drama", false, 2018);

        // Add each Movie object to the ArrayList
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        movies.add(movie11);
        movies.add(movie12);
        movies.add(movie13);
        movies.add(movie14);
        movies.add(movie15);
        movies.add(movie16);
        movies.add(movie17);
        movies.add(movie18);
        movies.add(movie19);
        movies.add(movie20);
        movies.add(movie21);
        movies.add(movie22);
        movies.add(movie23);
        movies.add(movie24);
        movies.add(movie25);
        movies.add(movie26);
        movies.add(movie27);
        movies.add(movie28);
        movies.add(movie29);
        movies.add(movie30);
        movies.add(movie31);
        movies.add(movie32);
        movies.add(movie33);
        movies.add(movie34);
        movies.add(movie35);
        movies.add(movie36);
        movies.add(movie37);
        movies.add(movie38);
        movies.add(movie39);
        movies.add(movie40);
        movies.add(movie41);
        movies.add(movie42);
        movies.add(movie43);
        movies.add(movie44);
        movies.add(movie45);
        movies.add(movie46);
        movies.add(movie47);
        movies.add(movie48);
        movies.add(movie49);
        movies.add(movie50);

        return movies;
    }
}
