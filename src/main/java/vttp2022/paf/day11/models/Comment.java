package vttp2022.paf.day11.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Comment {
    private String c_id;
    private String user;
    private Integer rating;
    private String c_text;
    private Integer gid;
    public String getC_id() {
        return c_id;
    }
    public Integer getGid() {
        return gid;
    }
    public void setGid(Integer gid) {
        this.gid = gid;
    }
    public String getC_text() {
        return c_text;
    }
    public void setC_text(String c_text) {
        this.c_text = c_text;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public static Comment create(SqlRowSet results){
        Comment c = new Comment();

        c.setC_id(results.getString("c_id"));
        c.setUser(results.getString("user"));
        c.setRating(results.getInt("rating"));
        c.setC_text(results.getString("c_text"));
        c.setGid(results.getInt("gid"));

        return c;
    }
    
}
