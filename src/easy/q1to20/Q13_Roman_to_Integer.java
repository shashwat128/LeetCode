package easy.q1to20;

public class Q13_Roman_to_Integer {
    public static void main(String[] args) {
        String roman = "XCII";
        int result = romanToInteger(roman);
        System.out.println(result);
    }

    private static int romanToInteger(String roman) {
        int len = roman.length();
        int value = 0;

        for (int i = 0; i < len; i++) {
            if (len != i + 1) {
                if(roman.charAt(i) == 'I' && roman.charAt(i + 1) == 'V')
                {
                    value = value + 4;
                    i++;
                    continue;
                }
                else if (roman.charAt(i) == 'I' && roman.charAt(i + 1) == 'X')
                {
                    value = value + 9;
                    i++;
                    continue;
                }
                else if (roman.charAt(i) == 'X' && roman.charAt(i + 1) == 'L')
                {
                    value = value + 40;
                    i++;
                    continue;
                }
                else if (roman.charAt(i) == 'X' && roman.charAt(i + 1) == 'C')
                {
                    value = value + 90;
                    i++;
                    continue;
                }
                else if (roman.charAt(i) == 'C' && roman.charAt(i + 1) == 'D')
                {
                    value = value + 400;
                    i++;
                    continue;
                }
                else if (roman.charAt(i) == 'C' && roman.charAt(i + 1) == 'M')
                {
                    value = value + 900;
                    i++;
                    continue;
                }
            }

            if (roman.charAt(i) == 'I')
                value = value + 1;
            else if (roman.charAt(i) == 'V')
                value = value + 5;
            else if (roman.charAt(i) == 'X')
                value = value + 10;
            else if (roman.charAt(i) == 'L')
                value = value + 50;
            else if (roman.charAt(i) == 'C')
                value = value + 100;
            else if (roman.charAt(i) == 'D')
                value = value + 500;
            else if (roman.charAt(i) == 'M')
                value = value + 1000;
        }
        return value;
    }
}
