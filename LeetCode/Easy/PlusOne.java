/*
    66. Plus One
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;

        while (i >=0 && digits[i] == 9) {
            i --;
        }
        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        int[] result = new int[digits.length];
        result[i] = digits[i] + 1;
        for (int j = 0; j < i; j ++) {
            result[j] = digits[j];
        }
        return result;
    }
}
