//Wrapper Class:- A class whose object contains or wraps PDT(Primitive data type like int, float etc).
//Object of a wrapper class contains a field which stores pdt.
//Example: Wrapper Class of int is Integer, float->float, char->Character, long->long

//Ques:- If someone ask i want object of wrapper class
//Ans->  Integer i = Integer.valueOf(4); sout(i);


//It creates a class of integer i and it creates space inside in memory.
//In place of integer i will use int int i=4 so it is variable Right!!!


//ArrayList 
//Symtax:- List<ArrayList>list=new ArrayList<AnyClass>();
//And it directly imported in java.util.ArrayList


//For new Element:-  l.add();   
//To access  the ith element:- sout(l1.get(1));

//Print with for loop
//for(int i=0; i<l1.size(); i++){sout(l1.get(1)); }

//Printing the Array list without for loop.--> sout(l1);
//Adding element at some index i --> l1.add(1,100);

//Modifying element at index i
//l1.set(1, 10);
//sout(1)

//Removing an element at index i
//l1.remove(1);
//sout(l1)

//Removing an element e which ou did not know which element we have to remove
// l1.remove(Integer.valueOf(17));

//Checking if an element exists:-
//boolean ans = (1.contains(Integers.valueOf(6)); sout(ans);

//If you dont specify class you can put anything inside l
//Arraylist l = new ArrayList();
//l.add("Shrejal")
//l.add(1);
//l.add(true);



//Ques:- Write a program to reverse the given ArrayList input:[0,10,3,5,22,10] output:[10,22,5,3,10,0]

import java.util.ArrayList;
public class p115 {
    static void reverseList(ArrayList<Integer>list){    //it recieve arraylist of integer
        int i=0, j=list.size()-1;

        while(i<j){

            /* these we will do in Array
             * int temp =a;
             * a=b;
             * b=temp;
             */

             Integer temp = Integer.valueOf(list.get(i));
             list.set(i,list.get(j));
             list.set(j,temp);
             i++;
             j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(5);
        list.add(22);
        list.add(10);
System.out.println("Original list" +list);
reverseList(list);
System.out.println("Reverse List = "+list);
    }
}
