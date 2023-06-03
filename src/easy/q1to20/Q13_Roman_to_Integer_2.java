package easy.q1to20;

public class Q13_Roman_to_Integer_2 {
    public static void main(String[] args) {
        String s = "IXX";
        int rti = romanToInt(s);
        System.out.println(rti);
    }
    private static int romanToInt(String s) {

        int previous = 0;
        int result = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            int current = conCharRomToInt(s.charAt(i));
            if(current >= previous) {
                result = result + current;
            } else {
                result = result - current;
            }

            previous = current;
        }
        return result;
    }

    private static int conCharRomToInt(char i) {
        return switch(i) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new RuntimeException("Not a valid input");
        };
    }
}
