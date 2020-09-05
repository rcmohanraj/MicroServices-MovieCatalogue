package com.rcmcode.microservices.movieinfoservice.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieSummary {

        private Boolean adult;
        private String backdropPath;
        private Object belongsToCollection;
        private Integer budget;
        private List<Genre> genres = null;
        private String homepage;
        private Integer id;
        private String imdbId;
        private String originalLanguage;
        private String originalTitle;
        private String overview;
        private Double popularity;
        private String posterPath;
        private List<ProductionCompany> productionCompanies = null;
        private List<ProductionCountry> productionCountries = null;
        private String releaseDate;
        private Integer revenue;
        private Integer runtime;
        private List<SpokenLanguage> spokenLanguages = null;
        private String status;
        private String tagline;
        private String title;
        private Boolean video;
        private Double voteAverage;
        private Integer voteCount;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Boolean getAdult() {
            return adult;
        }

        public void setAdult(Boolean adult) {
            this.adult = adult;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public Object getBelongsToCollection() {
            return belongsToCollection;
        }

        public void setBelongsToCollection(Object belongsToCollection) {
            this.belongsToCollection = belongsToCollection;
        }

        public Integer getBudget() {
            return budget;
        }

        public void setBudget(Integer budget) {
            this.budget = budget;
        }

        public List<Genre> getGenres() {
            return genres;
        }

        public void setGenres(List<Genre> genres) {
            this.genres = genres;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getImdbId() {
            return imdbId;
        }

        public void setImdbId(String imdbId) {
            this.imdbId = imdbId;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public Double getPopularity() {
            return popularity;
        }

        public void setPopularity(Double popularity) {
            this.popularity = popularity;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public List<ProductionCompany> getProductionCompanies() {
            return productionCompanies;
        }

        public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
            this.productionCompanies = productionCompanies;
        }

        public List<ProductionCountry> getProductionCountries() {
            return productionCountries;
        }

        public void setProductionCountries(List<ProductionCountry> productionCountries) {
            this.productionCountries = productionCountries;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public Integer getRevenue() {
            return revenue;
        }

        public void setRevenue(Integer revenue) {
            this.revenue = revenue;
        }

        public Integer getRuntime() {
            return runtime;
        }

        public void setRuntime(Integer runtime) {
            this.runtime = runtime;
        }

        public List<SpokenLanguage> getSpokenLanguages() {
            return spokenLanguages;
        }

        public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
            this.spokenLanguages = spokenLanguages;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTagline() {
            return tagline;
        }

        public void setTagline(String tagline) {
            this.tagline = tagline;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Boolean getVideo() {
            return video;
        }

        public void setVideo(Boolean video) {
            this.video = video;
        }

        public Double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(Double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public Integer getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(Integer voteCount) {
            this.voteCount = voteCount;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
    class Genre {

        private Integer id;
        private String name;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
    class ProductionCompany {

        private Integer id;
        private String logoPath;
        private String name;
        private String originCountry;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLogoPath() {
            return logoPath;
        }

        public void setLogoPath(String logoPath) {
            this.logoPath = logoPath;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(String originCountry) {
            this.originCountry = originCountry;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
    class ProductionCountry {

        private String iso31661;
        private String name;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    class SpokenLanguage {

        private String iso6391;
        private String name;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
