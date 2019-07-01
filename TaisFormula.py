n = int(input())
ar1 = [];
area = 0;

for i in range(n):
    ar1.append(input())

for i in range(len(ar1)-1):
    sum = float(ar1[i].split(' ')[1]) + float(ar1[i+1].split(' ')[1])
    sum /= 2
    sum *= int(ar1[i+1].split(' ')[0]) - int(ar1[i].split(' ')[0])
    area += sum / 1000

print(area)







