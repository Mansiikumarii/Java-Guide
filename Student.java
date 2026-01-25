public class Student {
    int rollNo;
    String name;
    int marks[] = new int[5];

    public Student(int rollNo, String name, int[] marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int calculateAverage(){
        int sum =0;
        for(int mark: marks){
            sum += mark;
        }
        return sum/5;
    }

    public char calculateGrade(){
        int avg = calculateAverage();
        if (avg >=90){
            return 'A';
        }
        else if(avg >= 75)
            return 'B';

        else if(avg >= 60)
            return 'C';
        else
            return 'D';
    }
    public static void main(String[] args) {
    int[] marks = {85, 90, 78, 92, 88};
    Student student = new Student(1, "John Doe", marks);
    System.out.println("Average Marks: " + student.calculateAverage());
    }
    }
