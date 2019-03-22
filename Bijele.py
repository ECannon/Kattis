ar1 = input().split()

king = 1 - int(ar1[0])
queen = 1-int(ar1[1])
rooks = 2-int(ar1[2])
bishops = 2-int(ar1[3])
knights = 2-int(ar1[4])
pawns = 8-int(ar1[5])

print(str(king) + " " + str(queen) + " " + str(rooks) + " " + str(bishops) + " " + str(knights) + " " + str(pawns))