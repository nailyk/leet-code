object RemoveElement_28 {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var k = 0
    var n = nums.length
    while (k < n) {
      if (nums(k) == `val`) {
        nums(k) = nums(n - 1)
        n -= 1
      } else {
        k += 1
      }
    }
    n
  }
}
