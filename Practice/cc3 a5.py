# Python program to find how many integer solutions (a, b, c) satisfy the equation a^2 + b^2 + c^2 = 169

def count_solutions(n):
    count = 0
    limit = int(n**0.5)  # maximum value for a, b, c such that a^2, b^2, c^2 <= n
    for a in range(-limit, limit + 1):
        for b in range(-limit, limit + 1):
            for c in range(-limit, limit + 1):
                if a**2 + b**2 + c**2 == n:
                    count += 1
                    print(a,b,c)
    return count

# Define n as 169
n = 169
solution_count = count_solutions(n)
print(solution_count)
