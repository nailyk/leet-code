object RemoveDuplicatesFromSortedArray2_80 {

  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    else if (nums.size <= 2) return nums.size
    else {
      var k = 2
      for (i <- 2 until nums.length) {
        if (nums(i) != nums(k - 2)) {
          nums(k) = nums(i)
          k += 1
        }
      }
      k
    }
  }
}
