public class PrintNumDecOrder {
    public static void decNum(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decNum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        decNum(n);
    }
}
