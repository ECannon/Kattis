cases = int(input())

for i in range(cases):
    n = int(input())
    if n % 2 == 0:
        print(n, "is even")
    else:
        print(n, "is odd")
