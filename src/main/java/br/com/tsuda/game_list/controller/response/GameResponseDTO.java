package br.com.tsuda.game_list.controller.response;

import br.com.tsuda.game_list.domain.entity.Game;

public class GameResponseDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameResponseDTO() {}

    public GameResponseDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        platforms = entity.getPlataform();
        score = entity.getScore();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        longDescription = entity.getLongDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
