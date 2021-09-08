package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Zeynep";
        p1.age = 26;

        p1.talk();
        p1.walk();
        p1.work(" Lawyer");

        Teacher t1 = new Teacher();
        t1.name = "Hazel";
        t1.age = 27;
        t1.teacherID = 1234;

        t1.work(" SDET");
        t1.walk();
        t1.talk();
        t1.teach("Java");

        Student s = new Student();
        s.study("java");

    }
}
