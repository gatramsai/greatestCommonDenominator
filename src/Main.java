public class Main {

    public static void main(String[] args) {
        gcd(2, 10);
    }

public static void gcd(int num1, int num2)
{
    int remainder = num2%num1;
    if (remainder==0)
        System.out.println(num1);
    else {
        num2 = num1;
        num1 = remainder;
        gcd(num1, num2);
    }

}
}
