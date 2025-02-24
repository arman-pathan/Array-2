class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();

        for (int i = 0; i < nums.length; i++) {
            hashTable.put(nums[i], true);
        }

        List<Integer> result = new LinkedList<Integer>();

        for (int i = 1; i <= nums.length; i++) {
            if (!hashTable.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}