#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Pot.py
# Date Created : 24/12/2019

N = int(input())

total = 0
for i in range(N):
    T = input()
    power = int(T[-1])
    num = int(T[0:-1])
    total += pow(num, power)

print (total)