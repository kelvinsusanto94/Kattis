#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Boat Parts.py
# Date Created :  29/1/2020

P, N = map(int, input().split())

found = False
parts = []
for i in range (N):
    S = input()

    if (S not in parts):
        parts.append(S)

    if (len(parts) == P):
        print (i + 1)
        found = True
        break

if (found == False):
    print ('paradox avoided')