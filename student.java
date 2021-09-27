public class student {
    //characteristics and behaviour
    // string is reference data type
    // private members allows , data hiding , with allowing getter and setter concept.
    //security
    private String name;
    private int rollno;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
 class StudentTest{
     public static void main(String[] args) {
         student obj1 = new student();
           obj1.setName("aish");
           obj1.setRollno(52);
           obj1.setAge(12);
         String result = obj1.getName();
         System.out.println(result);
         System.out.println(obj1.getRollno());
         System.out.println(obj1.getAge());
     }
 }