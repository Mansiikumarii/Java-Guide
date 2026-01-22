class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(String myName, int myId){
        id=myId;
        name = myName;
    }
    public MyEmployee(){
        id=21;
        name = "Prince Jain";
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee mansi = new MyEmployee("Swatee Gupta", 23);
        // mansi.setName("Mansi");
        // mansi.setId(22);
        System.out.println(mansi.getId());
        System.out.println(mansi.getName());

        MyEmployee mansi2 = new MyEmployee();
        // mansi.setName("Mansi");
        // mansi.setId(22);
        System.out.println(mansi2.getId());
        System.out.println(mansi2.getName());
    }
}
