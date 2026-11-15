public class exercise3 {
    public static void main(String[] args){
        OnlineStudent cass = new OnlineStudent("Cass", "9000008", "10067");
    }
}

class Person{
    protected String name;

    Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    protected String stu_id;

    Student(String name, String stu_id){
        super(name);
        this.stu_id = stu_id;
    }
}

class OnlineStudent extends Student{
    private String zoom_id;

    OnlineStudent(String name, String stu_id, String zoom_id){
        super(name, stu_id);
        this.zoom_id = zoom_id;
        System.out.printf("This student's name is: %s\n", this.name);
        System.out.printf("This student's ID is: %s\n", this.stu_id);
        System.err.printf("This student's zoom ID is %s\n", this.zoom_id);
    }
}