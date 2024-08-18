package dev.mxomeara.entertainment;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //Instanciate this class
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){ //Optional means that it might not return any movie so it will return null if it can't find it
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
//Uses repository class to get list of movies and returns to user