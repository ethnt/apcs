class Sorts
  class << self
    def selection(data)
      return data if data.size <= 1 # already sorted

      0.upto(data.length - 2) do |i|
        min = i
        (i + 1).upto(data.length - 1) do |j|
          min = j if data[j] < data[min]
        end

        data[i], data[min] = data[min], data[i] if i != min
      end

      data
    end

    def insertion(data)
      data[1..data.size].each_with_index do |j, index|
        i = index
       
        data[0..i].reverse.each do |k|
          break unless k > j
          data[i + 1] = k
          i = i - 1
        end
        
        data[i+1] = j
      end
    end

    def quicksort(data)
      return data if data.length <= 1

      lesser = []
      greater = []
      
      pivot = data.pop
      
      data.each do |item|
        if item <= pivot
          lesser << item
        end

        if item > pivot
          greater << item
        end
      end
      
      return quicksort(lesser) + [pivot] + quicksort(greater)
    end
  end
end

