import java.util.Scanner;
public class Ejemp2 {
    public static void main(String[] args ) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce un número ");
        int x=s.nextInt();
        int num=0;
        while (num!=x) {
            num++;
            System.out.println(num);
        }
    }
}
    
