package com.rcmcode.microservices.moviecatalogueservice.resource;

import com.rcmcode.microservices.moviecatalogueservice.models.CatalogueItem;
import com.rcmcode.microservices.moviecatalogueservice.models.UserRating;
import com.rcmcode.microservices.moviecatalogueservice.service.MovieInfoService;
import com.rcmcode.microservices.moviecatalogueservice.service.UserRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {

    @Autowired
    private MovieInfoService movieInfoService;

    @Autowired
    private UserRatingService userRatingService;

    @RequestMapping("/{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable("userId") String userId) {
        UserRating userRating = userRatingService.getUserRating(userId);
        return userRating.getRatings().stream()
                .map( rating -> movieInfoService.getCatalogueItem(rating))
                .collect(Collectors.toList());
    }

//    @HystrixCommand(fallbackMethod = "getFallbackCatalogue")
//    private Movie getCatalogue(Rating rating) {
//        return restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
//    }
//
//    @HystrixCommand(fallbackMethod = "getFallbackUserRating")
//    private UserRating getUserRating(String userId) {
//        return restTemplate.getForObject("http://rating-data-service/ratingsdata/users/"+userId, UserRating.class);
//    }
//
//    public List<CatalogueItem> getFallbackCatalogue(Rating rating) {
//        return Arrays.asList(new CatalogueItem("No Movie", "", rating.getRating()));
//    }
//
//    public UserRating getFallbackUserRating(String userId) {
//        UserRating userRating = new UserRating();
//        userRating.setRatings(Arrays.asList(new Rating("0", 0)));
//        return userRating;
//    }
}
