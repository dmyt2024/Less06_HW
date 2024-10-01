package app;

public class Solution {

    public static void main(String[]args){

        int [] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int sumOf = 0;

        for (int i = 0; i < numbers.length; i++) {

            sumOf += numbers[i];

            int sumIs = numbers[i];

            switch (sumIs){
                case 2:
                    sumIs+=1;
                    break;
                case 3:
                    sumIs+=3;
                    break;
                case 4:
                    sumIs+=6;
                    break;
                case 5:
                    sumIs+=10;
                    break;
                case 6:
                    sumIs+=15;
                    break;
            }
            System.out.printf("%d) Num is %d, sum is %d %n", numbers[i], numbers[i], sumIs);


        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " +sumOf);



    }
}
