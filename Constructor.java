class Student {
    int id;
    String name;
    Student() {
        id = 310;
        name = "madhumita";
    }
    void display() {
        System.out.println(id + " " + name);
    } 
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}



    

