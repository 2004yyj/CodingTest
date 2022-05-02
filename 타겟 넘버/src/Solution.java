class Solution {
    
    private int count = 0;
    
    public void calCounter(int[] numbers, int target, int depth, int result) {
        if (depth == numbers.length) {
            if (target == result) {
                count++;
            }
            return;
        }
        
        int add = result + numbers[depth];
        int sub = result - numbers[depth];
        
        calCounter(numbers, target, depth+1, add);
        calCounter(numbers, target, depth+1, sub);
    }
    
    public int solution(int[] numbers, int target) {
        calCounter(numbers, target, 0, 0);
        return count;
    }
}