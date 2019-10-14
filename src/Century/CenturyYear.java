package Century;

public class CenturyYear {

    public static void main(String[] args) {
        int test = centuryFromYear(1900);
        System.out.println(test);

    }

    static int centuryFromYear(int number) {
        if (number % 100 == 0) {
            number = number/ 100;
        } else {
            number = (number / 100) + 1;
        }
        return number;
    }

}