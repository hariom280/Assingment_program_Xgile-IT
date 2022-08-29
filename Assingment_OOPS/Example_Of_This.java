/***
 * This : this is a reference variable that refers to the current object.
 */
class StudentNew{
    int rollno;
    String name;
    float fee;
    StudentNew(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
public class Example_Of_This {
    public static void main(String[] args) {
        StudentNew s1=new StudentNew(111,"Ankur",5000f);
        StudentNew s2=new StudentNew(112,"Mithali",6000f);
        s1.display();
        s2.display();
    }
}
