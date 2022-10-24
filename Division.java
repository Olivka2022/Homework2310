public class Division {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        //int remainder=a % b;
        //int rest = a%b;
        if (a % b != 0) {
            System.out.println(" division with remainder " + a % b);
        } else {
            System.out.println(" division without remainder, result is  "+ a / b);
        }
    }
}
