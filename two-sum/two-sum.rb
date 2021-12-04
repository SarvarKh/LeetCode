# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    start_ind = 0
    ind = 1
    
    while (start_ind < nums.length - 1)
        while (ind < nums.length)
            if (nums[start_ind] + nums[ind] == target)
                return [start_ind, ind]
            else
                ind += 1
            end
        end
        
        start_ind += 1
        ind = start_ind + 1
    end
end

puts two_sum([3, 2, 4], 6)