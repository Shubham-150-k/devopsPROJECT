public class Person{
    String name;
    int age;

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

public class Student extends Person{
    int roll_no;
    float marks;

    Student(String name,int age,int roll_no,float marks)
    {
        super(name,age);
        this.roll_no=roll_no;
        this.marks=marks;
    }

   public static void main(String args[])
   {
        Student s1=new Student("Shubham",25,12,89.22f);
        System.Out.println(s1);
   }
    
}