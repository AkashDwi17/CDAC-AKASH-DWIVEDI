public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[5]; // Array of 5 students

        // Accept details
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n--- Enter details for Student " + (i+1) + " ---");
            students[i] = new Student();
            students[i].acceptDetails();
        }

        // Display info & result
        for (int i = 0; i < students.length; i++) {
            System.out.println("\n--- Student " + (i+1) + " Information ---");
            students[i].displayStudentInfo();
            students[i].findResult();
        }
    }
}
