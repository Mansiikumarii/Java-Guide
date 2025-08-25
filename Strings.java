public class Strings {
    public static void main(String args[]){
        // Strings
        //concatenate
        String name1 = "Shrishti";
        String name2 = "Rupali";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);
        System.out.println(name1.charAt(0));

        //length
        System.out.println(name2.length());

        //replace 
        String name = name2.replace('R','a' );
        System.out.println(name);

        System.out.println(name2);

        //substring
        String naam = "Shrishti and Rupali";
        System.out.println(naam.substring(0,4));
    }
}
