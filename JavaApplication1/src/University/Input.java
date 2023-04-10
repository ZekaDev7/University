/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Input {
        public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        String answer = sc.nextLine();
        return answer;
    }

    public static int requireNumber(String num) {
        Scanner sc = new Scanner(System.in);
        System.out.println(num);
        int answer = sc.nextInt();
        return answer;
    }
}
