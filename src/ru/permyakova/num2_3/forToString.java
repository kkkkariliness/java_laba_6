package ru.permyakova.num2_3;

@ToString(value = "yes")
public class forToString {

    @ToString(value = "no")
    public String defValue;

    public forToString() {
    }

    public String toString() {
        return this.defValue;
    }
}
