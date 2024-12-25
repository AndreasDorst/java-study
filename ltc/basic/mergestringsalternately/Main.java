package ltc.basic.mergestringsalternately;

public class Main {
    public static void main (String[] args) {
        System.out.println(Solution.mergeAlternately("abc", "pqr")); // Expected: "apbqcr"
        System.out.println(Solution.mergeAlternately("ab", "pqrs")); // Expected: "apbqrs"
        System.out.println(Solution.mergeAlternately("abcd", "pq")); // Expected: "apbqcd"
    }
}
