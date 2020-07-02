package it.mohanrc.microservices.moviecatalogueservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import it.mohanrc.microservices.moviecatalogueservice.models.CatalogueItem;
import it.mohanrc.microservices.moviecatalogueservice.models.Movie;
import it.mohanrc.microservices.moviecatalogueservice.models.Rating;
import it.mohanrc.microservices.moviecatalogueservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieInfoService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @HystrixCommand(fallbackMethod = "getFallbackCatalogue")
    public CatalogueItem getCatalogueItem(Rating rating) {
        Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
        return new CatalogueItem(movie.getName(), movie.getDesc(), rating.getRating());
    }

    private CatalogueItem getFallbackCatalogue(Rating rating) {
        return new CatalogueItem("Movie Not Found", "", rating.getRating());
    }

    //Reactive Way of Calling Rest Call.
    /*Movie movie = webClientBuilder.build()
            .get()
            .uri("http://localhost:8082/movies/"+rating.getMovieId())
            .retrieve()
            .bodyToMono(Movie.class)
            .block();*/
}
