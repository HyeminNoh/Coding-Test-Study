class Solution {
    public long solution(int N) {
        long[] width = new long[N];
        width[0] = 1;
        width[1] = 2;
        for(int i=2; i<width.length; i++){
            width[i] = width[i-1]+width[i-2];
        }
        return (width[N-2]+width[N-1])*2;
    }
}