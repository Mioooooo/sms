package edu.fjut.ywj.dao;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.dao.Comment
 * Date: Created in 2018/5/14 3:26
 */

public class Comment {
    private int id;
    private String mainText;
    private int accountId;
    private String time;
    private Integer blogId;
    private String lastCommentsId;
    private String nextCommentsId;

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", mainText='" + mainText + '\'' +
                ", accountId=" + accountId +
                ", time='" + time + '\'' +
                ", blogId=" + blogId +
                ", lastCommentsId='" + lastCommentsId + '\'' +
                ", nextCommentsId='" + nextCommentsId + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getLastCommentsId() {
        return lastCommentsId;
    }

    public void setLastCommentsId(String lastCommentsId) {
        this.lastCommentsId = lastCommentsId;
    }

    public String getNextCommentsId() {
        return nextCommentsId;
    }

    public void setNextCommentsId(String nextCommentsId) {
        this.nextCommentsId = nextCommentsId;
    }

    public Comment(int id, String mainText, int accountId, String time, Integer blogId, String lastCommentsId, String nextCommentsId) {

        this.id = id;
        this.mainText = mainText;
        this.accountId = accountId;
        this.time = time;
        this.blogId = blogId;
        this.lastCommentsId = lastCommentsId;
        this.nextCommentsId = nextCommentsId;
    }
}
