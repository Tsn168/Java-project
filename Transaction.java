public class Transaction {
    double amount;
    String time;
    String transaction_type;
    String user_ID;

    /*Transaction(){
        amount=0;
        time="Empty";
        transaction_type="Empty";
        user_ID="Empty";
    }*/
    Transaction(double a ,String b ,String c ,String d){
        amount=a;
        time=b;
        transaction_type=c;
        user_ID=d;
    }
    Transaction(double a ,String b ,String c){
        amount=a;
        transaction_type=b;
        user_ID=c;
    }
    
}