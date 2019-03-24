nums = input().split()
a = int(nums[0])
b = int(nums[1])
c = int(nums[2])
map = {}


truck1 = input().split()
for i in range(int(truck1[0]), int(truck1[1])):
    if(not i in map):
        map[i] = 1
    else:
        map[i] += 1

truck2 = input().split()
for i in range(int(truck2[0]), int(truck2[1])):
    if(not i in map):
        map[i] = 1
    else:
        map[i] += 1

truck3 = input().split()
for i in range(int(truck3[0]), int(truck3[1])):
    if(not i in map):
        map[i] = 1
    else:
        map[i] += 1

total = 0;

for i in map:
    if(map[i] == 3):
        total += map[i] * c
    elif(map[i] == 2):
        total += map[i] * b
    else:
        total += map[i] * a



print(total)




