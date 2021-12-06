# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
    local = 0
    global = -10**4
    i = 0
    
    while (i < nums.length)
        local = [nums[i], local+nums[i]].max
        if (local > global)
            global = local
        end
        i += 1
    end
    return global
end

nums = [-2,1,-3,4,-1,2,1,-5,4]
max_sub_array(nums)