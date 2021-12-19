import java.util.Scanner;

class Center {
    int tot_indore = 4;
    int tot_bhopal = 2;
    int tot_delhi = 3;

    static int a_indore = 0;
    static int a_bhopal = 0;
    static int a_delhi = 0;

    private static int indore = 4;
    private static int bhopal = 2;
    private static int delhi = 3;

    String dispalyCenterDetails() {
        // System.out.println("Enter Center no: ");
        // Scanner s = new Scanner(System.in);
        // int a = s.nextInt();
        // switch (a) {
        //     case 1:
                
        //         return "Total Seat = " + tot_indore + "\nAllocated seat = " + a_indore + "\nFree Seat = " + indore;
                
        //     case 2:
        //         return "Total Seat = " + tot_bhopal + "\nAllocated seat = " + a_bhopal + "\nFree Seat = " + bhopal;

        //     case 3:
        //         return "Total Seat = " + tot_delhi + "\nAllocated seat = " + a_delhi + "\nFree Seat = " + delhi;

        //     default:
        //         break;
        // }
        
        return null;
    
    }
    void showAllCenterDetails()
    {
        System.out.println("        Total    " + "Allocated"+"   Free");
        System.out.println("Indore" +"     "+tot_indore +"         "+a_indore +"        "+indore);
        System.out.println("Bhopal" +"     "+tot_bhopal+"         "+a_bhopal +"        "+bhopal);
        System.out.println("Delhi" +"     "+tot_delhi +"         "+a_delhi +"        "+delhi);
    }

    void showcenter() {
        System.out.println("1 : Indore");
        System.out.println("2 : Bhopal");
        System.out.println("3 : delhi");
    }

    String getc(int a) {
        String str = new String();
        switch (a) {
            case 1:
                if (indore > 0) {
                    str = "indore";
                    indore--;
                    a_indore++;
                    return str;
                }
                return null;
            case 2:
                if (bhopal > 0) {
                    str = "bhopal";
                    bhopal--;
                    a_bhopal++;
                    return str;
                }
                return null;
            case 3:
                if (delhi > 0) {
                    str = "delhi";
                    delhi--;
                    a_delhi++;
                    return str;
                }
                return null;
            default:
                return null;
        }
    }

    public String firstCenter(int a, int b, int c) {
        String str = new String();
        String str2 = new String();
        str = getc(a);
        if (str != null) {
            return str;
        } else
            str2 = getc(b);
        if (str2 != null) {
            return str2;
        } else {
            str = getc(c);
            return str;
        }

    }

}

class Student12 {
    String stuname, father_name, DOB, centerBook;
    String app_no;
    private static int count = 0;
    Scanner s = new Scanner(System.in);

    private String generateAppNo() {
        String r = "APPKU" + "0" + count;
        count++;
        return r;
    }

    public Student12() {
        app_no = generateAppNo();
    }

    void getCenter(String str) {
        centerBook = str;
    }

    void getDetails(String str1, String str2, String str3) {
        stuname = str1;
        father_name = str2;
        DOB = str3;
    }

}

public class Assignment3 {
    private static void displayDetails(String str, Student12 S[]) {
        String sub = str.substring((str.length() - 2), str.length());
        int n = Integer.parseInt(sub);
        System.out.println("Application No. : " + S[n].app_no);
        System.out.println("Name  : " + S[n].stuname);
        System.out.println("Father Name  : " + S[n].father_name);
        System.out.println("Date of Birth : " + S[n].DOB);
        System.out.println("Allocated Center : " + S[n].centerBook);
    }

    public static void main(String[] args) {
        int co = -1;
        Scanner src = new Scanner(System.in);
        Center c = new Center();
        Student12[] S = new Student12[100];
        loop: while (true) {
            System.out.println("Menu");
            System.out.println("1 : Enter Profile");
            System.out.println("2 : Choose Center");
            System.out.println("3 : Show Center Details");
            System.out.println("4 : Display All Center Details");
            System.out.println("5 : Candidate Details");
            System.out.println("6 : Exit");
            int n = src.nextInt();
            switch (n) {
                case 1:
                    co++;
                    S[co] = new Student12();
                    String str12, str2, str3;
                    System.out.println("Enter your Name");
                    str12 = src.next();
                    System.out.println("Enter Father Name");
                    str2 = src.next();
                    System.out.println("Enter DOB in dd/mm/yyyy format");
                    str3 = src.next();
                    S[co].getDetails(str12, str2, str3);
                    System.out.println("Your Application ID : "+S[co].app_no);
                    break;
                case 2:
                    System.out.println("Your Name is : " + S[co].stuname);
                    c.showcenter();
                    System.out.println("Enter Preference order");
                    int a = src.nextInt();
                    int b = src.nextInt();
                    int k = src.nextInt();
                    String str4 = new String();
                    str4 = c.firstCenter(a, b, k);
                    S[co].getCenter(str4);
                    break;
                case 3:
                    System.out.println(c.dispalyCenterDetails());
                    break;
                case 4:
                    c.showAllCenterDetails();
                break;
                case 5:
                    System.out.println("Enter Application id : ");
                    String str5;
                    str5 = src.next();
                    displayDetails(str5, S);
                    break;
                case 6:
                    break loop;
                default:
                    break;
            }
        }
        src.close();
       
    }
}