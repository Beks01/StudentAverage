package Lessons.Collections.Lesson_26_02_21;

public class Student {

    private String name;
    private int course;
    private int biology;
    private int english;
    private int physics;
    private int chemistry;
    private int mathematics;
    private double average;

    public Student() {
    }


    public Student(String name, int course, int biology, int english, int physics, int chemistry, int mathematics, double average) {
        this.name = name;
        this.course = course;
        this.biology = biology;
        this.english = english;
        this.physics = physics;
        this.chemistry = chemistry;
        this.mathematics = mathematics;
        this.average = average;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public int getBiology() {
        return biology;
    }

    public int getEnglish() {
        return english;
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getMathematics() {
        return mathematics;
    }

    public double getAverage() {
        return average;
    }
}