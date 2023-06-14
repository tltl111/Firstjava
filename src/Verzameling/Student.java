package Verzameling;
class Student {
    String name;
    int age;
    int grade;
    String school;

    public Student(String name, int age, int grade, String school) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.school = school;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void takeExam() {
        System.out.println(name + " is taking an exam");
    }

    public void displayInfo() {
        System.out.println(name + " is " + age + " years old and in grade "
                            + grade + " in school " + school);
    }
}
