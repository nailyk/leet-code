object RotateArray_89 {

  def rotate(nums: Array[Int], k: Int): Unit = {
    val n = nums.length
    val rotations = k % n
    val result = new Array[Int](n)
    for (i <- 0 until n) {
      result((i + rotations) % n) = nums(i)
    }
    Array.copy(result, 0, nums, 0, n)
  }

  def rotateInPlace(nums: Array[Int], k: Int): Unit = {
    val n = nums.length
    val rotations = k % n
    reverse(nums, 0, n - 1)
    reverse(nums, 0, rotations - 1)
    reverse(nums, rotations, n - 1)
  }

  private def reverse(nums: Array[Int], start: Int, end: Int): Unit = {
    var s = start
    var e = end
    while (s < e) {
      val temp = nums(s)
      nums(s) = nums(e)
      nums(e) = temp
      s += 1
      e -= 1
    }
  }
}
