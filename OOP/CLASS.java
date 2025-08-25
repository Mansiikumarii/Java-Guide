package OOP;

public class CLASS {
    public static class Student {
    String name;
    int rno;
    double percent;
    // public Student(String naam, int roll,int per){
    //     name = naam;
    //     rno= roll;
    //     percent = per;
    // }
        
    }
    // public static class Car {
    //     String name;
    //     String type;
    //     float price;
        
    // }
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.name = "Rolls-Royce";
        // c1.price = 255.80;
        //c1.type= "La Rose Noire Droptail";
        Student x= new Student();
        x.name = "Gunjan";
        x.rno = 6;
        x.percent= 92.5;
        System.out.println(x);
        System.out.println(x.percent+8);

        Student s = new Student();
        s.name = "Palak";
        s.percent = 97.2;
        s.rno = 33;
        System.out.println(s.name);
        
        // Student s1 = new Student("Anshul", 45, 92);
        // System.out.println(s1.name);
        // System.out.println(s1.percent);
        // System.out.println(s1.rno);
    }
}
