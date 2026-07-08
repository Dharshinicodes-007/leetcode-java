class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode sum=new ListNode(0);
      ListNode current=sum;
      int c=0;
      while(l1!=null || l2!=null || c!=0)
      {
        int x=(l1!=null)?l1.val:0;
        int y=(l2!=null)?l2.val:0;
        int total=x+y+c;
        c=total/10;
        current.next=new ListNode(total%10);
        current=current.next;
        if(l1!=null)l1=l1.next;
        if(l2!=null)l2=l2.next;
      }
      return sum.next;
    }
}