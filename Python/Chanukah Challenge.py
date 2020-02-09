#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Chanukah Challenge.py
# Date Created : 28/1/2020

import math

N = int(input())

for i in range (N):
    case, days = map(int, input().split())

    total = days

    if (days % 2 == 0):
        temp = ((days + 1) * (days // 2))
        total += temp
    else:
        temp = ((days + 1) * (days // 2))
        total += temp + (math.ceil(days / 2))

    print (case, total)