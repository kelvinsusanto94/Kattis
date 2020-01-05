#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Bela.py
# Date Created : 5/1/2020

card = ['7', '8', '9', 'T', 'J', 'Q', 'K', 'A']
dominant = [0, 0, 14, 10, 20, 3, 4, 11]
notdominant = [0, 0, 0, 10, 2, 3, 4, 11]

st, dm = input().split()
total = 0

for i in range(int(st) * 4):
    S = input()
    index = card.index(S[0])

    if (S[1] == dm):
        total += dominant[index]
    else:
        total += notdominant[index]

print(total)