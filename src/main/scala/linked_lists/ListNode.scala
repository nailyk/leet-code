class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object ListNode {
  def build(arr: Array[Int]): ListNode = {
    if (arr.isEmpty) return null
    val head = new ListNode(arr.head)
    var current = head
    for (i <- 1 until arr.length) {
      current.next = new ListNode(arr(i))
      current = current.next
    }
    head
  }
}
