public class Vector {
    private String name;
    private int age;
    private int studentId;

    // Constructor
    public Vector(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", studentId=" + studentId + "}";
    }

    public static void main(String[] args) {
        Vector v1 = new Vector("Amogh", 20, 24168333);
        System.out.println(v1);
    }
}
