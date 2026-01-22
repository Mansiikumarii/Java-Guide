import java.util.*;
public class FirstIndexOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //unorded map
        HashMap<Character,Integer> mp = new HashMap<>();

        //store with index +1
        for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(!mp.containsKey(ch)){
            mp.put(ch,i+1);
        }
        
        }
        StringBuilder finalStr = new StringBuilder();
        finalStr.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            finalStr.append("-");
            char ch = str.charAt(i);
            for(int j=0; j<mp.get(ch);j++){
                finalStr.append(ch);
            }
    }
    System.out.println(finalStr.toString());
}
}
