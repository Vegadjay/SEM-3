public class P12 {
    public static void main(String[] args) {
        for (int num = 10; num <= 1000; num++) {
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong Number");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        int numberOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, numberOfDigits);
            num /= 10;
        }
        return temp == sum;
    }
}
