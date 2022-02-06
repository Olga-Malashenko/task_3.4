package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {
    private int id;
    private int movieId;
    private String movieImageUrl;
    private String movieName;
    private String movieGenre;
    private boolean primereTomorrow;
    private String moviePageUrl;
}




