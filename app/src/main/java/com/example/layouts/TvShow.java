package com.example.layouts;

import java.util.ArrayList;

public class TvShow {
/*Title
 *Banner Image
 *Status
 *Network (label)
 *Rating (label)
 *First Air Date (label)
 *Seasons
 *  Episodes
 */

    public static final String DEFAULT_TITLE = "Your Title Here";
    public static final String DEFAULT_STATUS = "Ended";
    public static final String DEFAULT_NETWORK = "Local";
    public static final String DEFAULT_RATING = "NR";
    public static final String DEFAULT_AIR_DATE = "1970-01-01";

    private String title, status, network, rating, airDate;
    private int imageId;
    private ArrayList<Season> seasons;

    public TvShow(String title, String status, String network, String rating, String airDate, int imageId) {
        this.title = title;
        this.status = status;
        this.network = network;
        this.rating = rating;
        this.airDate = airDate;
        this.imageId = imageId;
        this.seasons = new ArrayList<>();
    }

    public TvShow(String title, String status, String network, String rating, String airDate, int imageId, int seasonNumber, String[] episodeNames) {
        this.title = title;
        this.status = status;
        this.network = network;
        this.rating = rating;
        this.airDate = airDate;
        this.imageId = imageId;
        this.seasons.add(new Season(seasonNumber, episodeNames));
    }

    public TvShow() {
        this.title = DEFAULT_TITLE;
        this.status = DEFAULT_STATUS;
        this.network = DEFAULT_NETWORK;
        this.rating = DEFAULT_RATING;
        this.airDate = DEFAULT_AIR_DATE;
        this.imageId = 0;
        this.seasons = new ArrayList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public String getStatus() {
        return this.status;
    }

    public String getNetwork() {
        return this.network;
    }

    public String getRating() {
        return this.rating;
    }

    public String getAirDate() {
        return this.airDate;
    }

    public int getImageId() {
        return this.imageId;
    }

    public int getSeasonNumber(int index) {
        return this.seasons.get(index).getSeasonNumber();
    }

    public String getEpisodeName(int seasonIndex, int episodeIndex) {
        return this.seasons.get(seasonIndex).getEpisode(episodeIndex);
    }

    public int getNumSeasons() {
        return this.seasons.size();
    }

    public int getNumEpisodes(int seasonIndex) {
        return this.seasons.get(seasonIndex).getNumEpisodes();
    }
}
