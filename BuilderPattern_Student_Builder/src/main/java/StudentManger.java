import java.util.List;

public class StudentManger {
    public static void main(String[] args){
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder("1001", "Kartik");
            studentBuilder.setEmail("Email Address")
                    .setPhone("7289705698")
                    .setSubjects(List.of("Science", "Maths"));
        Student newStudent = studentBuilder.build();
        System.out.println(newStudent.toString());
        System.out.println(newStudent.getSubjects());

    }
}
