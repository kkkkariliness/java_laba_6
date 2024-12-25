package ru.permyakova.num2_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD}) // Цель
@Retention(RetentionPolicy.RUNTIME) // Когда доступна

public @interface Default {
    Class<?> value();
}
