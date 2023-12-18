import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Student original = new Student("John Doe", 20, 3.5);
            original.serialize("student.ser");

            Student deserialized = Student.deserialize("student.ser");
            System.out.println(deserialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}