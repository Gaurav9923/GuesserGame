import java.util.Scanner;

public class Umpire {


    //public static Integer attempt;
    private static Integer choosedNum;
    public static int minRange;
    public  static int maxRange;
    private static final String umpire_password="123";
    public int match_id=0;
    public Guesser guess;





    public static String getPassword() {
        return umpire_password;
    }





    public void printRange(){

        getDataFromChooser();
        System.out.println("There will be "+"3"+" attempt gueeser can make "
                +"and range will be from "+minRange+" to "+maxRange);

        guess=  new Guesser();

    }





    public void getDataFromChooser() {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Umpire :: Hi players, I will be upmiring  this match ");

        Chooser choose =new Chooser();
        choosedNum=choose.getChoosedNumber();	//AutoBoxing

        minRange=choose.getMinRangeNumber();
        maxRange=choose.getMaxRangeNumber();
        System.out.println();


    }
    public Boolean checkGuessNumberFromGuesser(int guessedNumber) {
        Boolean flag=false;


        if(guessedNumber<minRange) {
            System.out.println("Guessed Number Not In Range");
        }
        else if(guessedNumber>maxRange) {
            System.out.println("Guessed Number Not In Range");
        }
        else if(guessedNumber==choosedNum) {
            flag=true;

            System.out.println(GuesserGame.g_name +" :: GUESSER WON !!!!");
        }
        else if(guessedNumber<choosedNum) {
            System.out.println("WRONG , Think Bigg??");
        }
        else if(guessedNumber>choosedNum) {
            System.out.println("WRONG , Think Small??");
        }
        else {
            System.out.println("GUESSER Lost !!!!");
        }
        return flag;

    }


}
