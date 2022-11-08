import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> arl=new ArrayList<Integer>(n);

        for (int i=0;i<=n;i++){
            arl.add(i);
        }
        System.out.println(arl);

        arl.remove(3);

        System.out.println(arl);

        for (int i=0; i<=arl.size(); i++){
            System.out.println(arl.get(i)+ " ");
        }


    }
}
