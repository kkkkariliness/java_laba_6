package ru.permyakova.num2_6;

@Cache(value = {"num1", "num2", "num3"})
public class forCache {

    private String first, second, third;

    public forCache(String first, String second, String third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String getFirst() {
        return this.first;
    }

    public String getSecond() {
        return this.second;
    }

    public String getThird() {
        return this.third;
    }
}
