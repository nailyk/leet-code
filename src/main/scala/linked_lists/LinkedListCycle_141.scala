import scala.collection.mutable.HashSet
object LinkedListCycle_141 {

  def hasCycleV1(head: ListNode): Boolean = {

    if (head == null) return false

    val visitedNodes = HashSet[ListNode](head)
    var nextNode = head.next
    while (nextNode != null) {
      if (visitedNodes(nextNode)) return true
      visitedNodes.add(nextNode)
      nextNode = nextNode.next
    }
    return false
  }

// more optimal solution using 2-pointers strategy with 0(1) space complexity
  def hasCycleV2(head: ListNode): Boolean = {
    var slow = head
    var fast = head

    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
      if (slow == fast) return true

    }
    return false
  }
}
