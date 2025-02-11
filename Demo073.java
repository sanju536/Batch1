import java.util.HashSet;
public class Demo073 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 4, 8, 2, 9 };
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}