package LambdaExpressions;

/**
 * InnerL2
 */
interface InnerL2 {
    void disp();
}

class Class implements InnerL2{
    public void disp(){
        System.out.println("Hello world!");
    }
}

public class L2 {
    public static void main(String[] args) {
        Class o = new Class();

        o.disp();
    }
}
