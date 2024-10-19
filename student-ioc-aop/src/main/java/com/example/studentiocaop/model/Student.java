package com.example.studentiocaop.model;

public class Student {
    private int sid;
    private String name;
    private String tele;

    // 构造方法
    public Student(int sid, String name, String tele) {
        this.sid = sid;
        this.name = name;
        this.tele = tele;
    }

    // Getter 和 Setter
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", name=" + name + ", tele=" + tele + "]";
    }
}
