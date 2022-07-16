package math;

public class Programmers_멀쩡한_사각형 {
    public long solution(int w, int h) {
        long wl = w;
        long hl = h;

        long gcdl = gcd(wl, hl);

        return wl * hl - (((wl / gcdl) + (hl / gcdl) - 1) * gcdl);
    }

    // 유클리드 호제법 최대공약수
    private long gcd(long n, long m) {
        while (m != 0) {
            long r = n % m;

            n = m;
            m = r;
        }

        return n;
    }
}
