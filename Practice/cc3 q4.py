from itertools import combinations

# Define the set of numbers
numbers = list(range(5, 111, 7))  # Numbers from 5 to 110 with a difference of 7
print("Numbers in the set:", numbers)

# Find all combinations of 4 distinct numbers
comb = combinations(numbers, 4)

# Calculate the sums of each combination
sums = set(sum(c) for c in comb)
listsums = []

# Populate the listsums with sums
for i in sums:
    listsums.append(i)

# Sort the listsums to create an ordered list
listsums.sort()

# Output the number of distinct sums and the ordered sums
print(f"The number of distinct sums is: {len(sums)}")
print("Ordered list of distinct sums:", listsums)
