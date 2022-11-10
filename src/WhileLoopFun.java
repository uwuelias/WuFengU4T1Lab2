public class WhileLoopFun {

    public WhileLoopFun() { }
    public void printDigits(int number) {
      while (number > 0) {
          System.out.println(number % 10);
          number /= 10;
      }
    }
    public int countLetter(String word, String letter) {
        int count = 0;
        for (int a = 0; a < word.length(); a++) {
            char b = letter.charAt(0);
            if (word.charAt(a) == b) {
                count++;
            }
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int counter = 0;
        number = number * 2;
        while (number <= threshold) {
            counter++;
            number *= 2;
        }
        return counter;
    }


    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
