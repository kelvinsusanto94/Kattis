#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : ICPC Awards.py
# Date Created : 16/1/2020

N = int(input())

schools, winners = [], []
for i in range (N):
    S = input()
    T = S.split()

    if (len(winners) == 12):
        break

    if (T[0] not in schools):
        schools.append(T[0])
        winners.append(S)

print ('\n'.join(winners))