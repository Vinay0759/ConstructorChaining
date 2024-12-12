package Constructor;

public class constructor{
    String name;
    long mobno;
    int amount;
    String address;
    String acctype;
    public constructor(String name){
        this.name=name;
    }
    public constructor(String name,long mobno){
        this(name);
        this.mobno=mobno;
    }
    public constructor(String name,long mobno,int amount){
        this(name,mobno);
        this.amount=amount;
    }
    public constructor(String name,long mobno,int amount,String address,String acctype){
        this(name,mobno,amount);
        this.address=address;
        this.acctype=acctype;
    }
    public static void Account(constructor m){
        System.out.println("Name: "+m.name);
        System.out.println("Mobile number: "+m.mobno);
        System.out.println("Amount: "+m.amount);
        System.out.println("Address: "+m.address);
        System.out.println("Account Type: "+m.acctype);
        System.out.println();
    }
    public static void main(String[] args) {
        constructor m1=new constructor("Rahul",8904127547L,150000,"Bangalore","Savings");
        Account(m1);
        constructor m2=new constructor("Ram",9964587367L,1450000,"Mysore","Current");
        Account(m2);

    }
}