import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[100];
    static String[] emails = new String[100];
    static String[] passwords = new String[100];
    
    static int index = 0;

    public static void main(String[] args) {

        inputMember();

        outputMember();

        sc.close();


    }

    static void inputMember () {

        while (true) {

            System.out.println("이름?");
            names[index] = sc.nextLine();

            System.out.println("이메일?");
            emails[index] = sc.nextLine();

            System.out.println("패스워드?");
            passwords[index] = sc.nextLine();
            
            index++;

            System.out.println("계속하실?");
            if(sc.nextLine().toLowerCase().equals("n")) {
                break;
            }
        }//while       
    }//inputMember

    static void outputMember () {
        for (int i = 0; i < index ; i++) {
            System.out.printf("%s,%s,%s\n",names[i],emails[i],passwords[i]);
        }
        
    }

}
