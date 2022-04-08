
class ListNode{
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        addList(1,head);
        addList(2,head);
        addList(4,head);
        printList(head.next);// 需要排除第一个节点的干扰 所以是head.next


        ListNode head2 = new ListNode();
        addList(1,head2);
        addList(3,head2);
        addList(4,head2);
        printList(head2.next);
        System.out.println(" ans is");

        ListNode ans = MergeTwoLists(head.next,head2.next);
        printList(ans);

    }

    public static void addList(int i, ListNode head){
        ListNode n = new ListNode(i);
        while (head.next!= null){
            head = head.next;  // 尾添加， head 一直没有变
        }
        head.next= n; // 找到最后一个元素，然后插入值
    }
    public static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.val);
            head = head.next;

        }
    }

    public static ListNode MergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode();
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                addList(l1.val,cur);
                l1 = l1.next;
            }else{
                addList(l2.val,cur);
                l2 = l2.next;
            }
        }

        // 考虑其中一条list为空
        if(l1==null){
            while (l2!=null){
                addList(l2.val,cur);
                l2 = l2.next;
            }
        }

        if(l2==null){
            while (l1!=null){
                addList(l1.val,cur);
                l1 = l1.next;
            }
        }
        return cur.next;


    }


}
