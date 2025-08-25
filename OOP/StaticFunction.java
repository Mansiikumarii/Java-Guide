package OOP;

public class StaticFunction {
       public static class Student {
    String name;
    int rno;
    double percent;
    final String schoolname = "Defence Public School";
     private static int numberOfStudent;
    public Student(String name, int rno,double percent){
        this.name= name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudent++;
    }
    public int getnumberOfStudent(){
        return numberOfStudent;
    }
      //Default Constructor
      public Student(){
        
      }  
    }
    public static void main(String[] args) {

        System.out.println(Student.numberOfStudent);
        Student s1 = new Student("Arushi",612,88.6);
        System.out.println(s1.getnumberOfStudent());

    }
}
