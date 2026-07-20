class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        List<List<Integer>> list=new ArrayList<>();
        for (int s = 0; s < k; s++) {

            int last = grid[n - 1][m - 1];

            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {

                    if (i == 0 && j == 0)
                        grid[0][0] = last;

                    else if (j == 0)
                        grid[i][0] = grid[i - 1][m - 1];

                    else
                        grid[i][j] = grid[i][j - 1];
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < grid[i].length; j++) {
                row.add(grid[i][j]);
            }

            list.add(row);
        }

        return list;

    }

}