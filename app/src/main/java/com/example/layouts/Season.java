package com.example.layouts;

import java.util.ArrayList;
import java.util.Collections;

public class Season {
    private int seasonNumber;
    private ArrayList<String> episodeNames;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public Season(int seasonNumber, String[] episodeNames) {
        this.seasonNumber = seasonNumber;
        this.episodeNames = new ArrayList<>(episodeNames.length);
        Collections.addAll(this.episodeNames, episodeNames);
    }

    public Season(int seasonNumber, ArrayList<String> episodeNames) {
        this.seasonNumber = seasonNumber;
        this.episodeNames = episodeNames;
    }

    public String getLastEpisode() {
        return this.episodeNames.get(episodeNames.size() - 1);
    }

    public int getSeasonNumber() {
        return this.seasonNumber;
    }

    public String getEpisode(int index) {
        return this.episodeNames.get(index);
    }

    public int getNumEpisodes() {
        return this.episodeNames.size();
    }
}
