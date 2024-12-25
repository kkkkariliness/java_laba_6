package ru.permyakova.num1_2;

import java.lang.reflect.Method;

public class Validate {

    public static void validate(Object obj, Class<?> tests) {


        try {

            Method[] methods = tests.getDeclaredMethods(); // Получаем все методы из переданного класса


            for (Method method : methods) {

                if (method.getParameterCount() == 1 && method.getParameterTypes()[0].isAssignableFrom(obj.getClass())) {

                    try {

                        method.setAccessible(true); // Делаем даже приватные методы доступными
                        method.invoke(null, obj); // Запускаем наш тест

                    } catch (Exception e) {

                        throw new IllegalArgumentException("Что-то пошло не так: " + e.getCause().getMessage());
                    }
                }
            }
        } catch (Exception e) {

            throw new IllegalArgumentException("Ошибка валидации! " + e.getMessage());
        }

    }
}
