public class Constructors {
    public Constructors(){
        System.out.println("Constructor created");
    }
    public Constructors(String a){
        System.out.println("Constructor created on " +a);
    }
    public static void main(String[] args){
        Constructors con = new Constructors();
        Constructors con1 = new Constructors("Sept");
        con.sum();
        con.sum1(10);
        con.sum2(15, 20);
        con1.sum();
        con1.sum1(10);
        con1.sum2(15, 20);
    }
    public void sum(){
        int a=10,b=20, c;
        c = a+b;
        System.out.println(c);
    }

    public int sum1(int a){
        int b=20, c;
        c = a+b;
        System.out.println(c);
        return c;
    }

    public int sum2(int a, int b){
        int c;
        c = a+b;
        System.out.println(c);
        return c;
    }
}
