package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int x = scanner.nextInt();
        int sum = 0;
        int count=0;
        while (x!=0){
            sum+=x;
            count++;
            x=scanner.nextInt();
        }
        int avg=sum/count;
        System.out.println(avg);

    }

}