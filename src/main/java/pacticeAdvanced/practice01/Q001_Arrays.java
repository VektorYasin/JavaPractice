package pacticeAdvanced.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q001_Arrays {
     /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the element to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.
  */
     public static void main(String[] args) {
         List<Integer> mylist = new ArrayList<>();

         Scanner input = new Scanner(System.in);

         System.out.println("Please enter 5 numbers to add :");

         for (int i = 0; i < 5; i++) {
             mylist.add(input.nextInt());
             System.out.println(mylist);
         }

         System.out.println("Please enter index to be removed :");
         int indexNumToBeRemoved= input.nextInt();
         mylist.remove(indexNumToBeRemoved);
         System.out.println(mylist);

         System.out.println("Please enter index to be updated :");
         int numToBeUpdated= input.nextInt();
         mylist.set(numToBeUpdated,10);
         System.out.println(mylist);

     }
}





