import java.util.Arrays;

public class clone {
    public static void main(String[] args) {

        int [] original = {1, 2, 3, 4};
        int [] copy = original.clone();

        System.out.print("Original Array -> ");
        for(int i=0;i< original.length;i++){
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Copied Array -> ");
        for(int i =0;i<copy.length;i++){
            System.out.print(copy[i]+ " ");
        }
        System.out.println();
        //copyOf
        System.out.print("COPYOF -> ");
        int [] copyof = Arrays.copyOf(original,4);
        for(int i=0;i<copyof.length;i++){
            System.out.print(copyof[i]+" ");
        }

        System.out.println();
        //COPYOFRANGE
        System.out.print("Copy of Range -> ");
        int [] copyOfRange = Arrays.copyOfRange(original,1,3);
        for(int i=0;i<copyOfRange.length;i++){
            System.out.print(copyOfRange[i]+" ");
        }
    }
}
