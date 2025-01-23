object AddTwoNumbers_2 {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var la = l1
    var lb = l2

    val newList = new ListNode()
    var carry = 0
    var cur = newList
    while (la != null || lb != null || carry != 0) {

      val v1 = if (la != null) la.x else 0
      val v2 = if (lb != null) lb.x else 0

      val sum = v1 + v2 + carry

      carry = sum / 10 // updating carry
      cur.next = new ListNode(sum % 10)
      cur = cur.next
      la = if (la != null) la.next else null
      lb = if (lb != null) lb.next else null
    }

    newList.next

  }
}
