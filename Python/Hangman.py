#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Hangman.py
# Date Created : 3/2/2020

S = list(set(input()))
T = input()

chance, result = 10, 'null'
for i in range (26):
    if (T[i] in S):
        S.remove(T[i])
    else:
        chance -= 1

    if (chance == 0):
        result = 'LOSE'
        break
    elif (S == []):
        result = 'WIN'
        break

print (result)
