class Minimum_Flips_to_Make_a_OR_b_Equal_to_c {
    public int minFlips(int a, int b, int c) {
        return Integer.bitCount(a & ~c) + Integer.bitCount(b & ~c) + Integer.bitCount(~(a | b) & c);
    }
}
