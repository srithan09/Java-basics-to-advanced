public class Solution {
    public int MaxElement(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for (int pile : piles) {
            if (pile > maxi) {
                maxi = pile;
            }
        }
        return maxi;
    }

    public int func(int[] piles, int hours) {
        int total = 0;
        for (int pile : piles) {
            total += (int) Math.ceil((double) pile / (double) hours);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = MaxElement(piles);
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int total_hours = func(piles, mid);

            if (total_hours <= h) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int minSpeed = sol.minEatingSpeed(piles, h);

        System.out.println("Minimum eating speed: " + minSpeed);
    }
}
