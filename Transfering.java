package Lessons.Collections.Lesson_26_02_21;

import java.io.IOException;

public class Transfering {
    public static String score(int biology, int english, int physics, int chemistry, int mathematics) throws IOException {

        Average b = new Average();
        b.average(biology, english, physics, chemistry, mathematics);
        if (b.average(biology, english, physics, chemistry, mathematics) >= 3) {
            return "Ваш средний балл выше 3. Вы прошли на следующий курс!";
        } else {
            return "Вы остались на прежнем курсе!";
        }
    }
}
