import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    static class Member{
        protected String name;
        protected String email;
        protected String password;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        
        
    }
    static Scanner sc = new Scanner(System.in);
    static Member[] members = new Member [100];

    static int index = 0;

    public static void main(String[] args) {

        inputMember();

        outputMember();

        sc.close();


    }

    static void inputMember () {

        while (true) {
            Member m = new Member();
            
            System.out.println("이름?");
            m.setName(sc.nextLine());

            System.out.println("이메일?");
            m.setEmail(sc.nextLine());

            System.out.println("패스워드?");
            m.setPassword(sc.nextLine());
            
            members[index++]= m ;

            System.out.println("계속하실?");
            if(sc.nextLine().toLowerCase().equals("n")) {
                break;
            }
        }//while       
    }//inputMember

    static void outputMember () {
        for (int i = 0; i < index ; i++) {
            System.out.printf("%s,%s,%s\n",members[i].getName(),members[i].getEmail(),members[i].getPassword());
        }
        
    }

}
