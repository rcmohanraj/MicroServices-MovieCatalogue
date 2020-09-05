package com.rcmcode.microservices.moviecatalogueservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rcmcode.microservices.moviecatalogueservice.models.CatalogueItem;
import com.rcmcode.microservices.moviecatalogueservice.models.Movie;
import com.rcmcode.microservices.moviecatalogueservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

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
