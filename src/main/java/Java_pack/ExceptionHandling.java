package Java_pack;

public class ExceptionHandling {

    public static void main(String[] args){

        try {
            int a = 5, c = 0;
            int b = a / c;
            System.out.println("Test Pass");
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Test Fail");
            System.out.println("Arithmetic Exception");
            throw new ArithmeticException("Test");

        }

    }
    public void multipleExceptionInSameClass(){
        try{
            int a=5;
            int b = a/0;
            int[] c = {1,2,3,4};
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(" ");

        }
    }
}
