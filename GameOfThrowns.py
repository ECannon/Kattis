line = input()

numStudents = int(line.split(' ')[0])
numCommands = int(line.split(' ')[1])
answers = [0]
flag = False
index = 0

line = input().split(' ')

for command in line:

    if command == "undo":
        flag = True
        continue
    else:
        index = (index + int(command))%numStudents
        answers.append(index)

    if flag:
        for i in range(int(command)+1):
            answers.pop()
        index = answers[-1]
        flag = False

print(index)