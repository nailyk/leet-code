object JumpGame_55 {

  def canJump(nums: Array[Int]): Boolean = {
    var goal = nums.length - 1
    for (i <- nums.length - 2 to 0 by -1) {
      if (i + nums(i) >= goal) {
        goal = i
      }
    }

    goal == 0
  }
}
