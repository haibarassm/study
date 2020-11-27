/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

public class DeepCopy LinkedList {
    public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }
        copy(head);
        copyRandom(head);
        return split(head);
    }
    
    private void copy(Node head){
        Node curHead=head;
        while(curHead!=null){
            Node copyNode= new Node(curHead.val);
            copyNode.next=curHead.next;
            curHead.next=copyNode;
            curHead=copyNode.next;
        }
    }
    
    private void copyRandom(Node head){
        Node curHead=head;
        while(curHead!=null&&curHead.next!=null){
            if(curHead.random!=null){
                Node copyNode= curHead.next;
                copyNode.random=curHead.random.next;
            }

            curHead=curHead.next.next;
        }
    }
    
       private Node split(Node head){
    // 当前头，就是第一个要复制的节点
        Node curHead=head;
        // 拿来挪位置的指针
        Node move=head.next;
        //    最后返回的复制完的头
        Node copyHead=head.next;
        while(curHead!=null&&curHead.next!=null){
            // 把原来1->1`的变成1->2
            curHead.next=curHead.next.next;
            // 我试了这个没有会抛空指针的
            if(move!=null&&move.next!=null){
                // 把原来的1`->2 变成 1`->2`
                move.next=move.next.next;
                // 复制的当前节点+1
                move=move.next;
            }
            // 原来的当前节点+1
            curHead=curHead.next;
        }
         return copyHead;
    }
}