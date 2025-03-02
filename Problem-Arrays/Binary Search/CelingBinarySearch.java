public class CelingBinarySearch {
    public long totalCount(int n) {
        long sum = n * (n + 1L) / 2;
        long total = 0;

        for (int i = 0; i <= n; i++) {
            long xor = XorSum(n, i);

            if (sum == xor) {
                total = total + i;
            }
        }

        return total;
    }

    private long XorSum(int n, int x) {
        long sum = 0;
        for (int bit = 0; bit < 32; bit++) {
            int mask = 1 << bit;
            int count = (int) (((n + 1L) / (mask << 1)) * mask + Math.max(0, (n + 1) % (mask << 1) - mask));
            int xbit = (x & mask) != 0 ? 1 : 0;
            sum = sum + (long) (count * (xbit ^ 1) + ((n + 1 - count) * xbit)) * mask;
        }
        return sum;
    }

    public static void main(String[] args) {
        CelingBinarySearch cbs = new CelingBinarySearch();
        int n = 5; // Example input
        System.out.println("Total count: " + cbs.totalCount(n));
    }
}