class Thirteen {

    public static long thirt(long n) {
        int[] sequence = {1, 10, 9, 12, 3, 4};
        long input = n;

        int seqIndex = 0;
        if (input < 0) {
            return input;
        } else {
            long result = 0;
            while (input > 0) {

                result = result + input % 10 * sequence[seqIndex];
                input = input / 10;
                seqIndex =  (seqIndex == 5)? 0: seqIndex + 1;
            }
           return (n == result)? n: thirt(result);
        }
    }
}
