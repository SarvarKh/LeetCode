# @param {Integer[]} prices
# @return {Integer}

def max_profit(prices)
    min = prices[0]
    profit = 0
    
    i = 0
    while (i < prices.length)
        if (prices[i] < min)
            min = prices[i]
        end
        if (profit < prices[i]-min)
            profit = prices[i]-min
        end
        i+=1
    end
    return profit
end

p max_profit([7,1,5,3,6,4])