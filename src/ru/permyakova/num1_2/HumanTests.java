package ru.permyakova.num1_2;

public class HumanTests {

    public static void testHeight(Human human) {

        if (human.getHeight() < 50 || human.getHeight() > 300) {
            throw new IllegalArgumentException("Неподходящий рост человека!");
        }
    }

    public static void testName(Human human) {

        if (human.getName() == null || human.getName().getFirstName() == null || human.getName().getFirstName().isBlank()
                || human.getName().getLastName() == null || human.getName().getLastName().isBlank()) {
            throw new IllegalArgumentException("Имя человека не может быть пустым!");
        }
    }

    // ну тут дальше тестики ещё возможно...
}
