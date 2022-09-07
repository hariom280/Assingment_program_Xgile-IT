// Method Overload change data type
class NewAdder{
 static int add(int a, int b){
  return a + b;
 }
 static double add(double a, double b){
  return a + b;
 }
}
public class MethodOverloadChangeData {
 public static void main(String[] args) {
  System.out.println(NewAdder.add(10,20));
  System.out.println(NewAdder.add(12.4, 13.4));
 }
}
