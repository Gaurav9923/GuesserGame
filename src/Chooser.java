import java.util.Random;
import java.util.Scanner;

public class Chooser{
    private static Integer choosedNumber;
    public static Integer minRange,maxRange;




    public   Chooser(){
        Scanner sc=new Scanner(System.in);


        System.out.println(GuesserGame.c_name+" :: Hey Chooser,do you want to generate random number to choose (yes or no)?");
        System.out.print(GuesserGame.c_name+" :: Chooser Input:: ");

        String str =sc.next();
        System.out.println();


        if(str.equals("yes")) {
            System.out.println();
            System.out.println(GuesserGame.c_name+" Enter the range to generate number");
            System.out.println(GuesserGame.c_name+" Enter the minimum number:: ");
            int min =sc.nextInt();
            minRange=min;
            System.out.println(GuesserGame.c_name+" Enter the maximum number:: ");
            int max=sc.nextInt();
            maxRange=max;

            choosedNumber=generateRandomNumberInRange(min,max);   //Autoboxing from int to Integer



        }
        else {
            System.out.println(GuesserGame.g_name+"::  Enter the Choosed number:: ");
            int num=sc.nextInt();
            choosedNumber=num;
            maxRange=num+5;
            int min;

            if((min=num-4)<=0 )
            {minRange= 0;}
            else {
                minRange=num-4;
            }



        }
    }

    public Integer getChoosedNumber() {
        return choosedNumber;             //AutoUnboxing
    }

    public Integer getMinRangeNumber() {
        return minRange;
    }
    public Integer getMaxRangeNumber() {
        return maxRange;
    }




    public int generateRandomNumberInRange(int min,int max) {
        Random genrateNum=new Random();
        int randomNumber=genrateNum.nextInt(max-min+1)+min;
        return randomNumber;
    }

}




