import ru.permyakova.num1_2.*;
import ru.permyakova.num2_1.*;
import ru.permyakova.num2_2.*;
import ru.permyakova.num2_3.*;
import ru.permyakova.num2_4.*;
import ru.permyakova.num2_5.*;
import ru.permyakova.num2_6.*;

import static java.lang.System.err;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        // ------------------------------------ 1 - 2 -------------------------------------------------

        out.println("------------------------------------ 1 - 2 -------------------------------------------------");

        Human h = new Human(new Name("Владимир", "Петрович"), 150);
        Human k = new Human(new Name("Игорь", ""), 250);
        Human p = new Human(null, 160);
        Human l = new Human(new Name("Акакий", "Акакиевич"), -12);

        out.println(h); // Выводим
        //out.println(k); // Выводим
        //out.println(p); // Выводим
        //out.println(l); // Выводим

        try {

            // Проводим валидацию объекта с помощью тестов из HumanTests
            Validate.validate(h, HumanTests.class);
            //Validate.validate(k, HumanTests.class);
            //Validate.validate(p, HumanTests.class);
            //Validate.validate(l, HumanTests.class);

        } catch (IllegalArgumentException e) {

            err.println(e.getMessage());
        }

        // ------------------------------------ 2 - 1 -------------------------------------------------

        out.println("------------------------------------ 2 - 1 -------------------------------------------------");

        forInvoke fi = new forInvoke();
        out.println(fi);

        // ------------------------------------ 2 - 2 -------------------------------------------------

        out.println("------------------------------------ 2 - 2 -------------------------------------------------");

        forDefault def = new forDefault();
        out.println(def.getDef());

        // ------------------------------------ 2 - 3 -------------------------------------------------

        out.println("------------------------------------ 2 - 3 -------------------------------------------------");

        forToString str = new forToString();
        out.println(str);

        // ------------------------------------ 2 - 4 -------------------------------------------------

        out.println("------------------------------------ 2 - 4 -------------------------------------------------");

        for_Validate fv =  new for_Validate();
        out.println(fv.getHeight());
        out.println(fv.getName());

        // ------------------------------------ 2 - 5 -------------------------------------------------

        out.println("------------------------------------ 2 - 5 -------------------------------------------------");

        forTwo ft = new forTwo("mem", 4);
        out.println(ft.getFirst());
        out.println(ft.getSecond());

        // ------------------------------------ 2 - 6 -------------------------------------------------

        out.println("------------------------------------ 2 - 6 -------------------------------------------------");

        forCache fc = new forCache("tro", "lo", "lo");
        out.println(fc.getFirst());
        out.println(fc.getSecond());
        out.println(fc.getThird());
    }
}