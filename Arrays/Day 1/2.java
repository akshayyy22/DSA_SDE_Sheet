class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        int n = numRows;
        for(int i = 0 ; i < n ; i++){
            List<Integer> row = new ArrayList<>();
            int value = 1;
            for(int j = 0 ; j <= i ; j++){
                row.add(value);
                value = value * (i - j) / (j + 1);
            }
            triangle.add(row);
        }

        return triangle;
    }
}