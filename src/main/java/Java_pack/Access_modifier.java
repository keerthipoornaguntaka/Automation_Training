package Java_pack;

public class Access_modifier {

    public int a= 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;
    public void test1(){
        System.out.println("Test1");


    }
    public void test2(){
        System.out.println("Test2");

    }
    public void test3(){
        System.out.println("Test3");

    }

    public void test4(){
        System.out.println("Test4");

    }
    public static void main(String[] args){
        Access_modifier access_modifier = new Access_modifier();
        int c = access_modifier.a;
        System.out.println(c);
        access_modifier.test2();
    }
}
