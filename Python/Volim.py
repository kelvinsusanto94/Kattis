#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Volim.py
# Date Created : 29/1/2020

start = int(input())
N = int(input())

time = 0
for i in range(N):
    S = input().split()

    time += int(S[0])
    if (time >= 210):
        break

    if (S[1] == 'T'):
        start += 1
        if (start > 8):
            start = 1

print (start)