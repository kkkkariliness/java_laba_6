package ru.permyakova.num2_4;

@_Validate(value = {Integer.class, String.class})
public class for_Validate {

    private int height;
    private String name;

    public for_Validate() {
        this.height = 100;
        this.name = "default";
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }
}
