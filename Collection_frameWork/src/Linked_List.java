import java.util.*;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;



public class Linked_List {
    public static void main(String[] args) {

        //ArrayList -> concrete class
        LinkedList<Integer> list = new LinkedList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("create list ->"+list);
        //Add element after creation of array
        list.add(40);
        System.out.println("Add extra  element ->"+list);

        //Remove element
        list.remove(1);
        System.out.println("remove element ->" +list);

        //addAll
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);

        //when add all element of list 2 in list 1
        list.addAll(list2);
        System.out.println("add all element of list2 ->"+list);

        //when add all element in list1 in list2
        //list2.addAll(list);
        //System.out.println("add all element of list ->"+list2);

        //Remove all element from list
        list.removeAll(list2);
        System.out.println("remove all element form list ->"+list);

        //checking the size of list
        System.out.println(list.size());

        //CLEAR THE LIST
        list2.clear();
        System.out.println("when the list is clear ->" + list2.size());

        //iterator
        // I want to travers list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("element -> "+ iterator.next());
        }

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);

        System.out.println("print the element by using index ->"+list3.get(0));

        System.out.println("Before set -> "+ list3);
        list3.set(0,125);
        System.out.println("After set ->" +list3);
        System.out.println("The size of set -> " +list3.size());

        //conver the list into Array by using toArray method collection framework

        Object[] arr = list3.toArray();
        for(Object obj: arr){
            System.out.println("The list  is convert into Array -> " + obj);
        }
        // contains
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number -> ");
        int nums = sc.nextInt();
        System.out.println(list3.contains(nums));

        list.add(12);
        list.add(6);
        System.out.println("Before the sorting -> "+list);
        //sort
        Collections.sort(list);
        //Ascending order
        System.out.println("After the sorting -> "+list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order -> "+list);

        //how to clone the list
        LinkedList<Integer> newList = (LinkedList<Integer>) list.clone();
        newList.add(45);
        System.out.println("clone list ->"+newList);

        //MINIMUM CAPACITY SIGN

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(100);
        marks.add(88);
        marks.add(48);

        marks.ensureCapacity(100);
        System.out.println("marks obtained :- "+marks);

        //check the array list is empty or not return ture and false
        System.out.println("the array is :- "+marks.isEmpty());

        //find the element in which index
        System.out.println("the element is index :- "+marks.indexOf(88));

        System.out.println("the last element of the list :-"+marks.lastIndexOf(48));

        //addFirst and addLast
        list.remove(3);
        list.remove(3);

        System.out.println("print the original list :-" +list);
        list.addFirst(142);
        list.addLast(112);
        System.out.println("after the list :- "+list);

        //removeFirst and removeLast
        System.out.println("before using the function :- "+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After using the function :- "+list);

        //get element by using the function
        System.out.println("i want to get the first element :- "+list.getFirst());
        System.out.println("I want to get the last element :-"+list.getLast());

        //print the starting element by using peek function
        System.out.println("the starting element is :- "+list.peek());

        //poll is used for return and remove the element
        System.out.println("Before the poll " +list);
        System.out.println("list using the poll function :- "+list.poll());
        System.out.println("After the poll " +list);

        //offer is  used for add the element in right most part of the list
        System.out.println("add at the end of the list :- "+list.offer(45));
        System.out.println("adding the offer function :- "+list);


    }
}
