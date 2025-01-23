object MergeTwoSortedLists_21 {
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
    val dummy = new ListNode()
    var cur = dummy
    var la = list1
    var lb = list2

    while (la != null && lb != null) {
      if (la.x < lb.x) {
        cur.next = la
        la = la.next
      } else {
        cur.next = lb
        lb = lb.next
      }
      cur = cur.next
    }

    if (la != null) cur.next = la
    if (lb != null) cur.next = lb

    dummy.next
  }
}
