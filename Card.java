public class Card{
    String status;//Active or Freeze
    String exp_date;//
    String card_ID;
    String card_type;//Visa or Saving(normal account)
    int limit_acc;

    Card(){
        status="Active";
        exp_date="Empty";
        card_ID="Empty";
        card_type="Empty";
        limit_acc=2;
    }

}
