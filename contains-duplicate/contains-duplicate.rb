# @param {Integer[]} nums
# @return {Boolean}

def contains_duplicate(nums)
    if nums.length == nums.uniq.length
        false
    else
        true
    end
end
    
puts contains_duplicate([1,2,3,1])