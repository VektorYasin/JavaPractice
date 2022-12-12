package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numArrayList {
    public static void main(String[] args) {
        //Type code to ask user to enter the int elements and add elements into the list
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st numbers...");
        int num1=input.nextInt();
        System.out.println("Enter 2nd numbers...");
        int num2=input.nextInt();
        System.out.println("Enter 3rd numbers...");
        int num3=input.nextInt();
        System.out.println("Enter 4th numbers...");
        int num4=input.nextInt();
        System.out.println("Enter 5th numbers...");
        int num5=input.nextInt();
        System.out.println("Enter 6th numbers...");
        int num6=input.nextInt();

        List<Integer> numbers=new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        System.out.println(numbers);//[1, 2, 3, 4, 5, 6]

        //Ask user to enter the elements to remove, then remove that element from list.
        System.out.println("Choose a number to remove from the list...");//user chooses 3.
        Integer numberBeRemoved=3;
        numbers.remove(numberBeRemoved);
        System.out.println(numbers);

        //Ask user to enter the element to update, then update it.
        System.out.println("Choose a number to update from the list...");//user chooses 3 with 50.
        numbers.set(2,50);
        System.out.println(numbers);


    }
}
