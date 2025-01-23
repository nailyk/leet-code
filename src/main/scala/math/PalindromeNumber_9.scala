object PalindromeNumber_9 {

  def isPalindrome(x: Int): Boolean = {

    if (x < 0) return false
    var number = x
    var reversed = 0
    while (number != 0) {
      reversed = reversed * 10 + number % 10
      number /= 10
    }
    return x == reversed
  }
}
