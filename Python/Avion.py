#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Avion.py
# Date Created : 24/1/2020

pos = []
for i in range (5):
    S = input()

    if ('FBI' in S):
        pos.append(i+1)

if (pos == []):
    print('HE GOT AWAY!')
else:
    print(*pos)