
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1) return head;

        int size = 0;
        Stack<ListNode> pilha = new Stack<>();
        ListNode headF = null;
        // Percorre até o fim salvando na stack e contando o tamanho
        while (head != null) {
            size++;
            if (size == k) {
                headF = head;
            }
            pilha.push(head);
            head = head.next;
        }   

        int restante = size - (k * (size / k));

        while (restante > 1) {
            pilha.pop();
            restante--;
            size--;
        }

        ListNode next;
        ListNode nextNext = null;
        ListNode prox = null;
        ListNode actual;

        if (restante == 1) {
            next = pilha.pop();
            size--;
        } else {
            next = null;
        }

        int iteracaoGrupo = 0;
        while (size > 0) {
            iteracaoGrupo++;

            for (int i=1; i<k; i++) {
                if (prox == null) {
                    actual = pilha.pop();
                    nextNext = actual;
                    size--;
                } else {
                    actual = prox;
                }
                prox = pilha.pop();
                size--;
                actual.next = prox;
            }

            prox.next = next;
            next = nextNext; // tem q receber o primeiro q iterou
            prox = null;
        }

        return headF;
    }
}
