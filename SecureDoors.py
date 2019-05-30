n = int(input())

ar1 = [];

for i in range(n):

    s1 = input()

    temp = s1.split(" ")

    if(temp[0] == "entry"):
        if(temp[1] in ar1):
            print(temp[1] + " entered (ANOMALY)")
        else:
            print(temp[1] + " entered")
            ar1.append(temp[1])
    else:
        if(not(temp[1] in ar1)):
            print(temp[1] + " exited (ANOMALY)")
        else:
            print(temp[1] + " exited")
            ar1.remove(temp[1])



