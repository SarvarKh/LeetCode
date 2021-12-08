# @param {Integer[]} nums
# @return {Integer}
def find_min(nums)
    return nums[0] if nums.size == 1
    
    left = 0
    right = nums.length - 1
    
    return nums[0] if nums[right] > nums[0]
    
    while right >= left
        mid = left + (right - left) / 2
        
        return nums[mid + 1] if nums[mid] > nums[mid + 1]
        
        return nums[mid] if nums[mid - 1] > nums[mid]
        
        if nums[mid] > nums[0]
            left = mid + 1
        else
            right = mid - 1
        end
    end
end

nums = [3,4,5,1,2]
find_min(nums)

nums = [4,5,6,7,0,1,2]
find_min(nums)

nums = [11,13,15,17]
find_min(nums)
