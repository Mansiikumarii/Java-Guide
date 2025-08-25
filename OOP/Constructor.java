package OOP;

public class Constructor {
    public static class Student {
    String name;
    int rno;
    double percent;
    public Student(String name, int rno,double percent){
        this.name= name;
        this.rno = rno;
        this.percent = percent;
    }
      //Default Constructor
      public Student(){
        
      }  
    }
    public static void main(String[] args) {
        Student s1 = new Student("Anshul", 45, 92);
        System.out.println(s1.name);
        System.out.println(s1.percent);
        System.out.println(s1.rno);

        Student s2 = new Student("Prince", 567, 94.4);
        System.out.println(s2.name);

    }
}
