package edu.fjut.ywj.dao;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.dao.BlogView
 * Date: Created in 2018/5/17 5:38
 */

public class BlogView {

    private String time;
    private String accountName;
    private Integer BrowseCount;
    private Integer accountId;
    private String mainText;
    private Integer id;
    private String title;

    public BlogView() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getBrowseCount() {
        return BrowseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        BrowseCount = browseCount;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BlogView(String time, String accountName, Integer browseCount, Integer accountId, String mainText, Integer id, String title) {

        this.time = time;
        this.accountName = accountName;
        BrowseCount = browseCount;
        this.accountId = accountId;
        this.mainText = mainText;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "BlogView{" +
                "time='" + time + '\'' +
                ", accountName=" + accountName +
                ", BrowseCount=" + BrowseCount +
                ", accountId=" + accountId +
                ", mainText='" + mainText + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
