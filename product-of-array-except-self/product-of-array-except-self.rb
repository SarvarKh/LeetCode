# @param {Integer[]} nums
# @return {Integer[]}

def product_except_self(nums)
    n = nums.size
    left = Array.new(n, 1)
    right = Array.new(n, 1)
    result = Array.new(n, 1)
    
    i = 1
    while(i<n)
        left[i] = left[i-1] * nums[i-1]
        i += 1
    end
    
    i = n-2
    while(i>=0)
        right[i] = right[i+1] * nums[i+1]
        i -= 1
    end
    
    i = 0
    while(i<n)
        result[i] = left[i] * right[i]
        i += 1
    end
    
    return result
end

puts product_except_self([1,2,3,4])
# puts product_except_self([0,0])

