package ca.duke.streams.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Movie {

    private String title;
    private int likes;
}
