package com.paprika.javaplayground;

/**
 * 整数逆序；
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int input = -127345;
        int output = reverseInteger(input);
        System.out.println("input:" + input + "\noutput:" + output);
    }


    /**
     * 123->321
     * -123->-321
     *
     * @param value
     * @return
     */
    public static int reverseInteger(int value) {
        int mode = 0;
        int result = 0;
        while (value != 0) {
            result = (result + mode) * 10;
            mode = value % 10;
            value /= 10;
        }
        result += mode;
        return result;
    }

}
