import java.util.Date;
import java.util.Random;

public class Card{
<<<<<<< HEAD
    String status;//Active or Freeze
    private String exp_date;//6 years exp
    private int card_num;//must be 16 digit
    String card_type;//Visa or Saving(normal account)
    private int CVV;
    String card_holder;


    Card(){
        status="Active";
        exp_date="Empty";
        card_num="Empty";
        card_type="Empty";
        CVV=000;
    }
    Card(String a, String b, String c){
        card_holder=a;
        card_num=b;
        exp_date=c;
    }
    public void card_creation(String name){
        Random rand= new Random();
        card_num=0000000000000000;
        CVV=000;
        Date D=new Date();
        int current_year=D.getYear()-100;
        status="Active";
        int current_month=D.getMonth();
        System.out.println("Here is your new card that just create : ");
        System.out.println("Card holder : " + name);
        System.out.println("Status : "+status);
        System.out.println("EXP Date : "+current_month+"/"+current_year);
        System.out.println("CVV : "+ CVV+1);
        System.out.println("Card Numbers : "+ (card_num+rand.nextInt(1000000)));
    }
    public void Get_Card_info(String password){
        if(){

        }

    }
=======
    String status;
    String exp_date;
    String card_ID;
    String card_type;
    int limit_acc;
>>>>>>> 9f8d6d1b8e70b161fb96c562391dca3fec4b2c31
}
