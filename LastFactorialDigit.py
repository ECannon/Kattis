cases = int(input())

for i in range(cases):
    n = int(input())
    fact = 1
    while(n > 1):
        fact *= n
        n -= 1

    print(fact%10)

