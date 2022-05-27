public class Main {
    public static void main(String[] args) {
/*
        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1; // do while will always execute do at least once.
        do {
            System.out.println(count);
            count++;
        } while(count !=6);
*/
        //CHALLENGE TIME
        /*
        Create a method called isEvenNumber that takes a parameter of type int
        its purpose is to determine if the argument passed to the method is
        an even number or not.
        Return true if an even number, otherwise return false.
         */
        System.out.println(isEvenNumber(5));
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;

            if (evenNumbersFound >= 5) {
                System.out.println("Total even numbers found = " + evenNumbersFound);
                break;
            }
        }
    }
        public static boolean isEvenNumber(int number){
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

