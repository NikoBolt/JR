package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*for (int i=0; i<10; i++)
        {
            num.add(Integer.parseInt(reader.readLine()));
        }*/


        /*
        int temp=0;
            for (int n=0;n<list.size();n++)
            {
                if(list.get(n)%3==0)
                {
                    temp+=3;
                }
                if (list.get(n)%2==0)
                {
                    temp+=5;
                }
                switch (temp)
                {
                    case 0:
                        other.add(list.get(n));
                        break;
                    case 3:
                        list3.add(list.get(n));
                        break;
                    case 5:
                        list2.add(list.get(n));
                        break;
                    case 8:
                        list3.add(list.get(n));
                        list2.add(list.get(n));
                        break;
                }
                temp=0;
            }
        */


        for (int i = 0; i < 20; i++)
        {
            num.add(Integer.parseInt(reader.readLine()));
            if ((num.get(i) % 3 == 0) && (num.get(i) % 2 == 0))
            {
                num3.add(num.get(i));
                num2.add(num.get(i));
            } else if (num.get(i) % 3 == 0)
                num3.add(num.get(i));
            else if (num.get(i) % 2 == 0)
                num2.add(num.get(i));
            else
                nums.add(num.get(i));
        }
        /*for (int i=0;i<num.size(); i++)
        {
            if (num.get(i)%2==0)
            {
                num2.add(num.get(i));
            }
            if (num.get(i)%3==0)
            {
                num3.add(num.get(i));
            }
            if(num.get(i)%2 !=0 && num.get(i)%3 !=0) {
                nums.add(num.get(i));
            }
        }*/

        printList(num3);
        //System.out.println(" fff");
        printList(num2);
        //System.out.println(" fff");
        printList(nums);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer Screen : list){
            System.out.println(Screen);
        }

        /*for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }*/
    }
}
