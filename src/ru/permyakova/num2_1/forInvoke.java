package ru.permyakova.num2_1;

public class forInvoke {

    private String str;

    public forInvoke() {
    }

    @Invoke
    public String toString() {
        return "Hello World";
    }
}
