package math;

class Programmers_나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        int x = 0;
        while (true) {
            x++;
            if (n % x == 1) {
                break;
            }
        }
        return x;
    }
}
