package Java_pack;

public class DataTypes {

    Integer i = new Integer(5);
    String s = "DATATYPES";
    String s1 = new String("AUTOMATION");

    public void test1(){
        System.out.println(s);
    }

    public String test2(){
        return "TEST2";
    }

    public int total(){
        return 5;
    }

    public boolean decide(){
        return true;
    }

    public static void main(String[] args) {
        int i = 9;
        String s = "Java";
        DataTypes dataTypes = new DataTypes();
        dataTypes.test1();

        String p = dataTypes.test2();
        System.out.println(p);

        System.out.println(i+s);
        String s1 = dataTypes.s;
        System.out.println(dataTypes.s);
        System.out.println(s1);

        boolean b = dataTypes.decide();
        System.out.println(b);
        System.out.println(dataTypes.total());
    }

}