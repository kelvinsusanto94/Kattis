#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Parking.py
# Date Created : 27/1/2020

case = int(input())

for i in range (case):
    N = int(input())

    S = input().split()
    S = list(map(int, S))
    S.sort()

    total = 0
    for j in range (N-1):
        total += (S[j+1] - S[j])
    total += (S[-1] - S[0])

    print (total)