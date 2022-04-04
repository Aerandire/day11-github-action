package vttp2022.paf.day11.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Game {
    private Integer gid;
    private String name;
    private Integer year;
    private Integer ranking;
    private Integer users_rated;
    private String url;
    private String image;

    public Integer getGid() {
        return gid;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getUsers_rated() {
        return users_rated;
    }
    public void setUsers_rated(Integer users_rated) {
        this.users_rated = users_rated;
    }
    public Integer getRanking() {
        return ranking;
    }
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public static Game create(SqlRowSet result){
        Game game = new Game();

        game.setGid(result.getInt("gid"));
        game.setName(result.getString("name"));
        game.setYear(result.getInt("year"));
        game.setRanking(result.getInt("ranking"));
        game.setUsers_rated(result.getInt("users_rated"));
        game.setUrl(result.getString("url"));
        game.setImage(result.getString("image"));

        return game;
    }
}
