package personalStudy;

public class Code03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int result = func(4);
        System.out.print(result);
    }
    public static int func(int n) {
        if(n<=0)
            return 0;
        else {
            System.out.println("Hello..");
            return n+func(n-1);
        }
    }

}
