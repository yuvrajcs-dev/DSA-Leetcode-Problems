class Solution {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!map.isEmpty()) {

            ArrayList<Integer> keys = new ArrayList<>(map.keySet());

            for (int x : keys) {
                ans.add(x);
                map.put(x, map.get(x) - 1);

                if (map.get(x) == 0) {
                    map.remove(x);
                }
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    
         
        


    }
}