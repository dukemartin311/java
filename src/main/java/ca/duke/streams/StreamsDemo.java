package ca.duke.streams;

import ca.duke.streams.movie.Movie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10),
                new Movie("b", 5),
                new Movie("c", 7));

        movies.stream().forEach(movie -> System.out.println(movie.getTitle()));

        movies.stream().max(Comparator.comparing(Movie::getLikes))
                .ifPresent(movie -> System.out.println(movie.getLikes()));

        movies.stream().map(Movie::getLikes).forEach(System.out::println);

        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));

        Optional<Integer> sum = movies.stream().map(Movie::getLikes).reduce((Integer::sum));
        System.out.println(sum.orElse(0));

        movies.stream().skip(1).limit(3).forEach(movie -> System.out.println(movie.getTitle()));

        Optional<Movie> firstMovie = movies.stream().findFirst();
        System.out.println(firstMovie);

        movies.stream().filter(movie -> movie.getLikes() > 5).forEach(movie -> System.out.println(movie.getTitle()));

        IntStream intStream = IntStream.of(1, 2, 3, 3);
    }

}
