import java.util.Scanner;
public class Assignment2 {
    public int su = 0;
    public int max=0, min=1, count = 1, temp = 0,tempmin=0;

    void sum(int s) {
        su = su + s;
    }

    void display() {
        System.out.println("Sum = " + su);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Count = " + (count - 1));

    }

    void max(int m) {

        if (m > max) {
            max = m;
        }
    }

    void min(int m) {
        
        if (m < tempmin) {
            min = m;
        }
        tempmin=m;
    }

    void co(int c) {
        count++;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        Assignment2 a2 = new Assignment2();
        while (true) {
            str = s.nextLine();
            if (str.equals("quit")) {
                break;
            }
            int n = Integer.parseInt(str);
            a2.sum(n);
            a2.max(n);
            a2.min(n);
            a2.co(n);
        }
        a2.display();
        s.close();
    }
   
}
