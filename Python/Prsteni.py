#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Prsteni.py
# Date Created : 29/1/2020

import math

N = int(input())
S = list(map(int, input().split()))

for i in range (1, N, 1):
    if (S[0] % S[i] == 0):
        print (S[0] // S[i], '/1', sep='')
    else:
        factor = math.gcd(S[0], S[i])
        if (factor == 0):
            factor = 1

        upper = (S[0] // factor)
        lower = (S[i] // factor)
        print (upper, '/', lower, sep='')