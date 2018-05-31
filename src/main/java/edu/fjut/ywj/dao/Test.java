package edu.fjut.ywj.dao;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.dao.test
 * Date: Created in 2018/5/23 14:11
 */

public class Test {

    private String s;
    private Integer i;

    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                ", i=" + i +
                '}';
    }

    public Test(String s, Integer i) {
        this.s = s;
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
