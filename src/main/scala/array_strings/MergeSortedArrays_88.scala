object MergeSortedArrays_88 {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var index1 = m - 1
    var index2 = n - 1
    var indexToInsert = m + n - 1
    while (index1 >= 0 && index2 >= 0) {
      if (nums1(index1) > nums2(index2)) {
        nums1(indexToInsert) = nums1(index1)
        index1 -= 1
      } else {
        nums1(indexToInsert) = nums2(index2)
        index2 -= 1
      }
      indexToInsert -= 1
    }

    if (index2 >= 0) {
      Array.copy(nums2, 0, nums1, 0, index2 + 1)
    }

  }
}
