package edu.fjut.ywj.dao;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.dao.Blog
 * Date: Created in 2018/5/14 3:19
 */

public class Blog {
    private int id;
    private String title;
    private String mainText;
    private String time;
    private int accountId;

    private int browseCount;

    public Blog() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

            this.title=title;

    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        if(mainText.length()>300){
            this.mainText = mainText.substring(0,300)+"...";
        }else{
            this.mainText=mainText;
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    public int getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(int browseCount) {
        this.browseCount = browseCount;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", mainText='" + mainText + '\'' +
                ", time='" + time + '\'' +
                ", accountId=" + accountId +
                ", browseCount=" + browseCount +
                '}';
    }

    public Blog(int id, String title, String mainText, String time, int accountId, int browseCount) {

        this.id = id;
        this.title = title;
        this.mainText = mainText;
        this.time = time;
        this.accountId = accountId;
        this.browseCount = browseCount;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
