public class processing {
    public static void main(String[] args) {
        String test = "1001100111";
        System.out.println(bauercode(test));
    }

    public static String bauercode(String input) {
        int counter1 = 1;
        char[] output = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                counter1++;
            }
        }
        if (counter1 % 2 == 0) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '1') {
                    output[i] = '0';

                }else if(input.charAt(i) == '0'){
                    output[i] = '1';

                }

            }


            return new String(output);
        } else {
            return input;
        }


    }
}
