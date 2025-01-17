object RemoveDuplicatesFromSortedArray_26 {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    var k = 1
    for (i <- 1 until nums.length) {
      if (nums(i) != nums(i - 1)) {
        nums(k) = nums(i)
        k += 1
      }
    }
    k
  }
}
