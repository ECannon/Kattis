n = int(input())
ar1 = []

for i in range(n):
    s1 = input()
    if(s1[0].isdigit()):
        ar1.append(s1.split()[1] + " " + str(int(s1.split()[0])/2))
    else:
        ar1.append(s1)

ar1.sort(key = lambda x: float(x.split()[1]))

for i in ar1:
    print(i.split()[0])
