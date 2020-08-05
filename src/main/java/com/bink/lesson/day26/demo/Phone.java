package com.bink.lesson.day26.demo;

/**
 * @author yangbingkun
 * 2020/7/20 --5:02 下午
 */
public class Phone {
    private String brand;
    private double price;
    private String color;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 打电话
     *
     * @param name 名称
     */
    public void call(String name) {
        System.out.println("给" + name + "打电话！");
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
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
