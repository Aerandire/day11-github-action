package vttp2022.paf.day11.Repository;

public interface Queries {
    public static final String SQL_SELECT_BY_GAME_GID 
                    = "select * from game where gid = ?";

    public static final String SQL_SELECT_COMMENT_BY_GID 
    = "select * from comment where gid = ? limit ? offset ?";

    public static final String SQL_COUNT_SELECT_COMMENT_BY_GID
    = "select count(*) from comment where gid = ? limit ? offset ?";
}
