package com.rcmcode.microservices.ratingdataservice.models;

import java.util.Arrays;
import java.util.List;

public class UserRating {

    private String userId;
    private List<Rating> ratings;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void initData(String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("501", 4),
                new Rating("502", 3)
        );
        this.setUserId(userId);
        this.setRatings(ratings);
    }
}
