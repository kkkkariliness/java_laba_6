package ru.permyakova.num2_5;

@Two(first = "nomer", second = 2)
public class forTwo {

    private String first;
    private int second;

    public forTwo(String first, int second){

        this.first = first;
        this.second = second;
    }

    public String getFirst(){
        return this.first;
    }

    public Integer getSecond(){
        return this.second;
    }
}
