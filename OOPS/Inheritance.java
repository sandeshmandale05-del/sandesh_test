package OOPS;
public class Inheritance{
    public static void main(String args[]){
       
        Teacher t1=new Teacher();
        t1.Attitude();
    }
}

class Student{
    String name="Hii Sandesh";
    int id=240706659;
    void College(){
        System.out.println("Yeshwantrao Chavan College of Engineering Nagpur");
    }

    void Attitude(){
        System.out.println("Need more than present");
    }
}
class Teacher extends Student{
    String name="Heated";
    
}