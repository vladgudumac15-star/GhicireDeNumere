import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int y,x,z;
      System.out.println("Alegeti un numar de la 1 la infinit");
      x=sc.nextInt();
      y =(int)(Math.random() * (x+1));
      System.out.println("Introduceti un numar de la 0 pana la "+x);
      do{
        z=sc.nextInt();
        if(z==y) break;
        if(z<y)
        System.out.println("Prea mic");
        else if(z>y)
        System.out.println("Prea mare");
      }
      while(z!=y);
      for(int i=0;i<50;i++)
      System.out.println();
      System.out.print("Felicitari ai ghicit numarul!!!");
      for(int i=0;i<9;i++)
      System.out.println();
    }
}