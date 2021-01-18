package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(""+getLargestPrime(45));
    }

    public static int getLargestPrime(int number){
        if(number < 2 || number < 0){
            return -1;
        }

        int temp = 1;
       for (int x = number; number != temp;){
            temp = number;
                for (int y = 2; y < number; y++) {
                    if (number % y == 0) {
                        number /= y;
                        break;
                    }
                }
        }

        if (number <2){
            return -1;
        } else {
            return number;
        }
    }
}
