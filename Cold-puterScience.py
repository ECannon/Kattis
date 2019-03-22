n = int(input())
s1 = input()
ar1 = s1.split()
count = 0;
for i in ar1:
    if(int(i) < 0): count+=1;
print(count)
