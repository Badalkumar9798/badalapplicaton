import java.util.*;




public class stack {
    public static void main(String[] args) {

        //ArrayList -> concrete class
        List<Integer> list = new Stack<>();

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
        List<Integer> list2 = new ArrayList<>();
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

        List<Integer> list3 = new Stack<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        list3.add(14);

        System.out.println("print the element by using index ->"+list3.get(0));

        System.out.println("Before set -> "+ list3);
        list3.set(0,125);
        System.out.println("After set ->" +list3);
        System.out.println("The size of set -> " +list3.size());

        //convert the list into Array by using toArray method collection framework

        Object[] arr = list3.toArray();
        for(Object obj: arr){
            System.out.println("The list  is convert into Array -> " + obj);
        }
        // contains
        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the number -> ");
        //int nums = sc.nextInt();
        System.out.println(list3.contains(12));

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
       // ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        //newList.add(45);
        //System.out.println("clone list ->"+newList);

        //MINIMUM CAPACITY SIGN

        List<Integer> marks = new Stack<>();
        marks.add(100);
        marks.add(88);
        marks.add(48);

        marks.isEmpty();
        System.out.println("marks obtained :- "+marks);

        //check the array list is empty or not return ture and false
        System.out.println("the array is :- "+marks.isEmpty());

        //find the element in which index
        System.out.println("the element is index :- "+marks.indexOf(88));

        System.out.println("the last element of the list :-"+marks.lastIndexOf(88));

        Stack<Integer> st = new Stack<>();
        //Adding element in stack
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println("Adding element -> "+st);
        //remove element from stack
        st.pop();
        System.out.println("Remove element -> "+st);
        //view top element

        System.out.println("View the top element -> "+st.peek());
        //Search the element
        System.out.println("Searching the element -> "+ st.search(30));
        System.out.println(st.search(10));
        //check the stack is empty or not
        System.out.println("Check the element is empty or not -> "+st.isEmpty());



    }
}
