class MainStudent {
    static int studentCount = 0;
    public static void main(String[] args) {

        Student student1 = new Student("Dennis", 20, 10, "Something");
        increaseStudentCount();

        Student student2 = new Student("Mike", 21, 10, "Something");
        increaseStudentCount();

        student1.displayInfo();
        student2.displayInfo();

        int totalStudents = getStudentCount();
        System.out.println("Total number of students: " + totalStudents);
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void increaseStudentCount() {
        studentCount++;
    }
}
