// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // Initialize dummy node to handle head of the result list
        ListNode current = dummyHead;  // Pointer to build the result list
        int carry = 0;  // To store carry for sums >= 10

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with carry
            
            if (l1 != null) {
                sum += l1.val;  // Add the current node's value from l1 if exists
                l1 = l1.next;  // Move to next node in l1
            }

            if (l2 != null) {
                sum += l2.val;  // Add the current node's value from l2 if exists
                l2 = l2.next;  // Move to next node in l2
            }

            carry = sum / 10;  // Compute carry for next iteration (if sum >= 10)
            current.next = new ListNode(sum % 10);  // Create a new node with the result of sum % 10 (digit to store)
            current = current.next;  // Move current pointer to next node
        }

        return dummyHead.next;  // Return the actual result (skip the dummy node)
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LTCode004 solution = new LTCode004();
        
        // Create the first linked list: 2 -> 4 -> 3 (represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create the second linked list: 5 -> 6 -> 4 (represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two numbers (342 + 465 = 807)
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result: expected output is 7 -> 0 -> 8
        printList(result);
    }
}
