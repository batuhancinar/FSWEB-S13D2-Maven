package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number){
        number=Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for(int i = digits.length - 1; i >=0; i--) {
            reversed += digits[i];


        }
        return reversed.equalsIgnoreCase(String.valueOf(number));

    }
    public static boolean isPerfectNumber(int number){
        if(number <0)
            return false;

        int toplam = 0;
        for(int i=1; i <= number/2; i++){
            if(number%i ==0){
                toplam += i;
            }
        }
        return toplam == number;

    }


}
