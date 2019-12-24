#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Nasty Hacks.py
# Date Created : 24/12/2019

N =int(input())

for i in range(N):
    T = input().split()
    r, e, c = int(T[0]), int(T[1]), int(T[2])

    if (e-c > r):
        print('advertise')
    elif (e-c < r):
        print('do not advertise')
    else:
        print('does not matter')