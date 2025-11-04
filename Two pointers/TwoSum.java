   class Solution{
	public int[] twoSum(int[] nums, int target){
		HashMap<Integer, Integer> twoSumMap= new HashMap<>();
		
		int left =0, right = nums.length-1;
		while(left<right){
			int sum = arr[left]+arr[right];
			if(sum == target){
				twoSumMap.put(0,left);
				twoSumMap.put(1,right);
				List<Integer> twoSumList = new ArrayList<>(twoSumMap.values();
				return twoSumList;
				Break;
			}
			else{
				return 0;
			}
			left++;
			right--;
		}
}
}
		
