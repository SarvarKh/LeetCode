# @param {Integer[]} nums
# @return {Integer}
def max_product(nums)
    curMax = 1
    curMin = 1
    res = nums[0]
    
    nums.each do |n|
        vals = [n, n*curMax, n*curMin]
        curMax = vals.max
        curMin = vals.min
        
        res = [res, curMax].max
    end
    
    return res
end

nums = [2,3,-2,4]
p max_product(nums)
p max_product([-2,0,-1])