package Lessons.Collections.Lesson_26_02_21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String... args) throws IOException {
        try {


            List<Student> ac = new ArrayList<Student>();
            Scanner scan = new Scanner(System.in);
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("Name: ");
                String name = scan.next();
                if (name.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.println("Course: ");
                int course = scan.nextInt();
                if (course == 0) {
                    break;
                }
                System.out.println("Biology: ");
                int biology = scan.nextInt();
                if (biology == 0) {
                    break;
                }
                System.out.println("English: ");
                int english = scan.nextInt();
                if (english == 0) {
                    break;
                }
                System.out.println("Physics: ");
                int physics = scan.nextInt();
                if (physics == 0) {
                    break;
                }
                System.out.println("Chemistry: ");
                int chemistry = scan.nextInt();
                if (chemistry == 0) {
                    break;
                }
                System.out.println("Mathematics: ");
                int mathematics = scan.nextInt();
                if (mathematics == 0) {
                    break;
                }
                Average av = new Average();
                Student a = new Student(name, course, biology, english, chemistry, physics, mathematics, av.average(biology, english, chemistry, physics, mathematics));
                ac.add(a);
            }
            for (Student t : ac) {
                System.out.printf("Name:%s Course:%d Biology:%d English:%d Physics:%d Chemistry:%d Mathematics:%d Average:%s \n", t.getName(), t.getCourse(), t.getBiology(), t.getEnglish(), t.getPhysics(), t.getChemistry(), t.getMathematics(), t.getAverage());
                System.out.println(Transfering.score(t.getBiology(), t.getEnglish(), t.getPhysics(), t.getChemistry(), t.getMathematics()));
                System.out.println();
            }
        }catch (Exception e){
            System.err.println("Ulan");
        }
    }
}