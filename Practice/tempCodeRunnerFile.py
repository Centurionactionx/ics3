avg = int(input())
courses = int(input())
minimum = (courses + 1) * 80 - avg * courses
if minimum >= 80 and minimum <= 100:
    print(minimum)
else:
    print(-1)