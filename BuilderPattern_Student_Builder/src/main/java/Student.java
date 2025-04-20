import java.util.List;

public class Student {
    // ensure immutability by declaring them as private final
    private final String id;
    private final String name;
    private final String email;
    private final String phone;
    private final List<String> subjects;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public static class StudentBuilder{
        private String id;
        private String name;
        private String email = "";
        private String phone = "";
        private List<String> subjects;
        public StudentBuilder setSubjects(List<String> subjects) {
            this.subjects = subjects;
            return this;
        }

        public StudentBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder(String id, String name){
            this.id = id;
            this.name = name;
        }


        public Student build() {
            return new Student(this);
        }

    }

    // ensure that the constructor is private and only builder can build
    private Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.subjects = builder.subjects;
        this.phone = builder.phone;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
