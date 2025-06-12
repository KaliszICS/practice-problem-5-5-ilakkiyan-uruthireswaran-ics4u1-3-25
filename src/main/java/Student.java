public class Student implements Comparable<Student>{
    protected String name;
    protected int age;
    protected String studentNumber;

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
//org.opentest4j.AssertionFailedError: Student class does not have required constructor with name, age, and student number parameters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
    }

    @Override
    public int compareTo(Student newStudent) {
       
        int thisSN = Integer.parseInt(this.getStudentNumber());
        int otherSN = Integer.parseInt(newStudent.getStudentNumber());

        if (thisSN > otherSN) return 1;
        else if (thisSN == otherSN) return 0;
        else return -1;
    }


}