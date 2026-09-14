public class lengthOfLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        public static int getLength(ListNode head) {
            int count = 0;
            ListNode current = head;

            while(current !=null){
                count++;
                current = current.next;
            }
            return count;
        }
        public static void printAsArray(ListNode head){
            int length = getLength(head);
            int[] array = new int[length];
            ListNode current = head;
            int index =0;

            while(current !=null){
                array[index++] = current.val;
                current = current.next;
            }
            System.out.println("[ ");
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]);
                if(i<array.length -1){
                    System.out.println(", ");
                }
            }
            System.out.println("] ");
        }
    }
}
