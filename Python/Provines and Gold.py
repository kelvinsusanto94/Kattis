#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Provincecs and Gold.py
# Date Created : 16/1/2020

costs = [3, 2, 1]
S = input().split()
S = [int(i) for i in S]

total = 0
for i in range (3):
    total += (S[i] * costs[i])

if (total <= 1):
    print ('Copper')
else:
    if (total >= 8):
        victory = 'Province'
    elif (total >= 5):
        victory = 'Duchy'
    else:
        victory = 'Estate'

    if (total >= 6):
        treasure = 'Gold'
    elif (total >= 3):
        treasure = 'Silver'
    else:
        treasure = 'Copper'

    print (victory, 'or', treasure)