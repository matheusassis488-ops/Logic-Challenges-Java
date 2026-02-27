class PalindromeNumber {
    public boolean isPalindrome(int x) {
       if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }

    int reverse = 0;
    int copy = x;

    while (copy > reverse) {
        reverse = reverse * 10 + copy % 10;
        copy /= 10;
    }

    return copy == reverse || copy == reverse / 10;
    }
}
