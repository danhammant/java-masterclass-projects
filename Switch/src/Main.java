
public class Main {

    public static void main (String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually, it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        System.out.println();

        char switchChar = 'A';

        switch (switchChar) {
            case 'A':
                System.out.println("Char is A");
                break;
            case 'B':
                System.out.println("Char is B");
                break;
            case 'C':
                System.out.println("Char is C");
                break;
            case 'D':
                System.out.println("Char is D");
                break;
            case 'E':
                System.out.println("Char is E");
                break;
            default:
                System.out.println("Char not found");
                break;
        }

        System.out.println();

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");

        }
    }
}
