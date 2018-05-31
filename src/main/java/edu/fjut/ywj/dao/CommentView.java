package edu.fjut.ywj.dao;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.dao.CommentView
 * Date: Created in 2018/5/18 5:42
 */

public class CommentView {

    private Integer id;
    private String accountName;
    private String time;
    private CommentView lastCommentView;
    private String mainText;

    public CommentView(Integer id, String accountName, String time, CommentView lastCommentView, String mainText) {
        this.id = id;
        this.accountName = accountName;
        this.time = time;
        this.lastCommentView = lastCommentView;
        this.mainText = mainText;
    }

    @Override
    public String toString() {
        return "CommentView{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", time='" + time + '\'' +
                ", lastCommentView=" + lastCommentView +
                ", mainText='" + mainText + '\'' +
                '}';
    }

    public CommentView() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CommentView getLastCommentView() {
        return lastCommentView;
    }

    public void setLastCommentView(CommentView lastCommentView) {
        this.lastCommentView = lastCommentView;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }
}
