import java.util.Scanner;

public class GuesserGame {
   public static String  c_name,g_name;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Umpire ump=new Umpire();



 

            System.out.println("=========|| Guesser Game Match ||========= ");
            System.out.println();
            System.out.print("Umpire pease enter the password to start the Game (123)::");
            String pass_check=sc.next().trim();



            if(pass_check.equals(Umpire.getPassword())) {



                System.out.println("Enter Guesser player name::");
                 g_name=sc.next();




                System.out.println();
                System.out.println("Enter Chooser player name::");
                 c_name=sc.next();



                //print range
                ump.printRange();





            }
            else {
                System.out.println("Wrong Password ");
            }








    }

}
