package com.bink.lesson09.day17;

/**
 * @author yangbingkun
 * @Package com.bink.lesson09.day17
 * @date 2020/9/17 --5:56 下午
 */
public class Emp {
    private int id;
    private String name;
    private int jobId;

    public Emp() {
    }

    public Emp(int id, String name, int jobId) {
        this.id = id;
        this.name = name;
        this.jobId = jobId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
}
