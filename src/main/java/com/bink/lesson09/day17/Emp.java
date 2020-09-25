package com.bink.lesson09.day17;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * @author yangbingkun
 * @Package com.bink.lesson09.day17
 * @date 2020/9/17 --5:56 下午
 */
@Entity
@Table
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Integer jobId;

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

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobId=" + jobId +
                '}';
    }


}
