package ru.permyakova.num2_2;

@Default(value = Integer.class)
public class forDefault {

    @Default(value = Integer.class)
    private Integer v;

    public forDefault() {
        this.v = 1;
    }

    public int getDef(){
        return this.v;
    }
}
