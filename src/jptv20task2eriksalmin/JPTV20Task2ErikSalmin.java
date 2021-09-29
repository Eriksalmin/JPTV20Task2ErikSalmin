/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task2eriksalmin;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV20Task2ErikSalmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
int number = scanner.nextInt();  
        System.out.println("Сумма цифр равна: "+ sumDigits(number)); 

}


public static int sumDigits(int number) {

        int sum = 0;

        while  (number != 0) {

               sum += number%10;

               number /= 10;

         }

         return sum; 

}
    }
    
}
