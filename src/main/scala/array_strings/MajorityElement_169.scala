object MajorityElement_169 {

  def majorityElement(nums: Array[Int]): Int = {
    var candidate = nums(0)
    var counter = 1
    for (i <- 1 until nums.length) {
      if (counter == 0) {
        candidate = nums(i)
        counter += 1
      }
      else if (candidate == nums(i))
        counter += 1
      else
        counter -= 1
    }

    candidate
  }

    def majorityElementTailRec(nums: Array[Int]): Int = {
    @annotation.tailrec
    def majorityElementHelper(nums: Array[Int], candidate: Int, counter: Int, index: Int): Int = {
      if (index == nums.length) candidate
      else if (counter == 0) majorityElementHelper(nums, nums(index), 1, index + 1)
      else if (candidate == nums(index)) majorityElementHelper(nums, candidate, counter + 1, index + 1)
      else majorityElementHelper(nums, candidate, counter - 1, index + 1)
    }

    majorityElementHelper(nums, nums(0), 1, 1)
  }
}
