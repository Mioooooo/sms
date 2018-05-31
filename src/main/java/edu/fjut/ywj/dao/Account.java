package edu.fjut.ywj.dao;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.dao.Account
 * Date: Created in 2018/5/10 14:18
 */

public class Account {
    private int id;
    private String name;
    private String password;
    private String netName;
    private String job;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", netName='" + netName + '\'' +
                ", job='" + job + '\'' +
                ", TEL='" + TEL + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private String TEL;
    private String email;

    public Account(int id, String name, String password, String netName, String job, String TEL, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.netName = netName;
        this.job = job;
        this.TEL = TEL;
        this.email = email;
    }

    public String getNetName() {

        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
        this.id=0;
    }

    public Account() {
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
