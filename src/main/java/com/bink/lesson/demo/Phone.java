package com.bink.lesson.demo;

/**
 * @author yangbingkun
 * 2020/7/20 --5:02 下午
 */
public class Phone {
    private String brand;
    private double price;
    private String color;

    /**
     * 打电话
     *
     * @param name 名称
     */
    public void call(String name) {
        System.out.println("给" + name + "打电话！");
    }

    /**
     * 发短信
     */
    public void sendMessage() {
        System.out.println("群发短信！");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
