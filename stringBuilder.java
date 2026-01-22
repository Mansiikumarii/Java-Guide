public class stringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Arushi");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        sb.insert(0,'P');
        System.out.println(sb);

        sb.insert(2, 'a');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append("a");
        sb.append("u");
        sb.append("p");
        System.out.println(sb);

        System.out.println(sb.length());

        for(int i=0; i<sb.length()/2 ; i++){
            int front = i;
            int back = sb.length()-1-i;
            char fronChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fronChar);

        }
        System.out.println(sb);
    }
}
