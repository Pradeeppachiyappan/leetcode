class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int low = 1, high = x, mid;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }
}
