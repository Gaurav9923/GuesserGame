import java.util.Scanner;

public class Guesser {
	 Boolean res;
	    Umpire ump=new Umpire();
	    public int attempt=3 ;
	    public Guesser(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println();
	        for(int i=1;i<=attempt;i++) {
	            System.out.println();
	            System.out.println(GuesserGame.g_name +":: Guesser's attempt ::"+i);
	            int guess=sc.nextInt();
	            res=ump.checkGuessNumberFromGuesser(guess);
	            if(res==true) {

	                break;
	            }

	        }
	        if(res==false) {
	            System.out.println(GuesserGame.g_name +" ##Guesser Lost");

	        }

	    }


}
