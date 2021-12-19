import java.util.Scanner;

class Castvote {

    int jdu = 0, congress = 0, bjp = 0, bsp = 0, aap = 0;

    public void Castvote123(int n) {

        switch (n) {
            case 1:
                bjp = bjp + 1;
                System.out.println("Voted to BJP");
                break;
            case 2:
                aap = aap + 1;
                System.out.println("Voted to AAP");
                break;
            case 3:
                congress = congress + 1;
                System.out.println("Voted to Congress");
                break;
            case 4:
                bsp = bsp + 1;
                System.out.println("Voted to BSP");
                break;
            case 5:
                jdu = jdu + 1;
                System.out.println("Voted to JDU");
                break;
            default:
                break;
        }
    }

    public String toString() {
        return "BJP = " + bjp + "\nAAP = " + aap + "\nCongress = " + congress + "\nBSP = " + bsp + "\nJDU = " + jdu;
    }

}

public class Assignment {

    void dispalyParty() {
        System.out.println("1 : BJP");
        System.out.println("2 : AAP");
        System.out.println("3 : Congress");
        System.out.println("4 : BSP");
        System.out.println("5 : JDU");
    }

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        Assignment a = new Assignment();
        Castvote c = new Castvote();
        int count = 0;
        int b;
        loop: while (true) {
            System.out.println("1 : Cast vote");
            System.out.println("2 : Display party name ");
            System.out.println("3 : Display Result");
            System.out.println("4 : Exit");
            int n = src.nextInt();
            switch (n) {
                case 1:
                    count = count + 1;
                    a.dispalyParty();
                    b = src.nextInt();
                    c.Castvote123(b);
                    if (count % 5 == 0 || count % 7 == 0) {
                        c.bjp = c.bjp + 1;
                        switch (b) {
                            case 1:
                                break;
                            case 2:
                                c.aap = c.aap - 1;
                                break;
                            case 3:
                                c.congress = c.congress - 1;
                                break;
                            case 4:
                                c.bsp = c.bsp - 1;
                                break;
                            case 5:
                                c.jdu = c.jdu - 1;
                                break;
                        }
                    }
                    break;
                case 2:
                    a.dispalyParty();
                    break;
                case 3:
                    System.out.println(c.toString());
                    System.out.println("Total Vote = " + count);
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

        src.close();
    }
}
