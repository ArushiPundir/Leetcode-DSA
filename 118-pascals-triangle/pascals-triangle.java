class Solution {
    public List<Integer> generateRow(int row){
        List<Integer> ans = new ArrayList<>();
        int ncr = 1;
        ans.add(ncr);
        for(int col = 1;col<row;col++){
            ncr = ncr * (row-col);
            ncr = ncr/col;
            ans.add(ncr);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i =1; i<=numRows;i++){
            result.add(generateRow(i));
        }
        return result;
    }
}