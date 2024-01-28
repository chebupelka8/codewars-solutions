def find_it(array: list[int]):
    odd_numbers = [i for i in range(100) if i % 2 != 0]

    for i in array:
        for j in odd_numbers:
            if array.count(i) == j: return i