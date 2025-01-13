import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.TestSuite
import org.scalatest.tools.TestElement

class LeetCode88Spec extends AnyFlatSpec {

  behavior of "LeetCode88.merge"

  it should "merge two arrays (test case 1)" in {
    val nums1 = Array(1, 2, 3, 0, 0, 0)
    val nums2 = Array(2, 5, 6)

    MergeSortedArrays_88.merge(nums1, 3, nums2, 3)
    assert(nums1 === Array(1, 2, 2, 3, 5, 6))
  }

  it should "merge two arrays (test case 2)" in {
    val nums1 = Array(1)
    val nums2 = Array.empty[Int]

    MergeSortedArrays_88.merge(nums1, 1, nums2, 0)
    assert(nums1 === Array(1))
  }

  it should "merge two arrays (test case 3)" in {
    val nums1 = Array(0)
    val nums2 = Array(1)

    MergeSortedArrays_88.merge(nums1, 0, nums2, 1)
    assert(nums1 === Array(1))
  }

  it should "merge two arrays (test case 4)" in {
    val nums1 = Array(2, 0)
    val nums2 = Array(1)

    MergeSortedArrays_88.merge(nums1, 1, nums2, 1)
    assert(nums1 === Array(1, 2))
  }

  it should "merge two arrays (test case 5)" in {
    val nums1 = Array(4, 5, 6, 0, 0, 0)
    val nums2 = Array(1, 2, 3)

    MergeSortedArrays_88.merge(nums1, 3, nums2, 3)
    assert(nums1 === Array(1, 2, 3, 4, 5, 6))
  }
}
