public class PrintNumDecOrder {
    public static void decNum(int n){
        if(n == 1){ //base condition to return and avoid stackoverflowerror
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");//before minus printing value
        decNum(n-1); //pass 9 and then 8..7 ..6......1
    }
    public static void main(String[] args) {
        int n = 10;
        decNum(n);//passing 10 decNum(n)
    }
}
