package OOP;

public class Staticc {
       public static class Student {
    String name;
    int rno;
    double percent;
    final String schoolname = "Defence Public School";
     static int numberOfStudent;
    public Student(String name, int rno,double percent){
        this.name= name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudent++;
    }
      //Default Constructor
      public Student(){
        
      }  
    }
    public static void main(String[] args) {
         Student s1 = new Student("Anshul", 45, 92);
       System.out.println(s1.numberOfStudent);

        Student s2 = new Student("Prince", 567, 94.4);
       System.out.println(s2.numberOfStudent);

       Student s3 = new Student("Khushi",510,91.3);
       System.out.println(s3.numberOfStudent);

    }
}
