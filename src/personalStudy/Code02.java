package personalStudy;

public class Code02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=4;
        func(n);
    }
    public static void func(int k) {
        if (k<=0)
            return;
        else {
            System.out.println("hello...");
            func(k-1);
        }
    }

}
