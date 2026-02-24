package week06;

public class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department){
        this.department = department;

    }

    public String getCourses() {
        return courses;

    }

    public void setCourses(String courses){
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.getFirstName() + " " + super.getLastName();

}
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Teacher)) return false;
        Teacher t = (Teacher) obj;
        return super.equals(t) && this.department.equals(t.getDepartment()) && this.courses.equals(t.getCourses());
    }
}
