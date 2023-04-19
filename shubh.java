public class abstract Account_Detail{
 int account_number;
 String Name;
 int Mobile_number;

 Account_Detail(int account_number,String Name,int Mobile_number){
    this.account_number=account_number;
    this.name=name;
    this.Mobile_number=Mobile_number;
 }
}

public class Simple_interest extends Account_Detail{

    double interest;
    int year;
    double amount;

    Simple_interest(double interest,int year,double amount,int account_number,String name,int Mobile_number)
    {
        super(account_number,name,Mobile_number);
        this.interest=interest;
        this.year=year;
        this.amount=amount;
    }
    //public static void main(String []args)   
}

public class Compound_interest{
    int Compound_interest;
    int year;
    double amount;

    Compound_interest(int Compound_interest,int year,double amount,int account_number,String name,int Mobile_number)
    {
        super(account_number,name,Mobile_number);
        this.Compound_interest=Compound_interest;
        this.year=year;
        this.amount=amount;
    }
}