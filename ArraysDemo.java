import java.util.Arrays;
public class ArraysDemo {
    public static void main(String args[]){
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);
        //length
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] grade = {97,98,95};
        // 2-D array
        int [][] finalMarks = {{97,98,95},{95,95,98}};
        System.out.println(finalMarks[0][0]);
    }
}
