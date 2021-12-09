# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer}
def search(nums, target)
    return -1 if !nums.include?(target)
    
    nums.index(target)
end

