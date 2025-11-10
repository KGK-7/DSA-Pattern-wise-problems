from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        max_area = 0
        while left < right:
            left_height = height[left]
            right_height = height[right]
            width = right - left
            area = min(left_height, right_height)* width

            if area > max_area:
                max_area = area
            if left_height < right_height:
                left += 1
            else:
                right -= 1
        return max_area

print(Solution().maxArea([1,8,6,2,5,4,8,3,7]))  # Output: 49