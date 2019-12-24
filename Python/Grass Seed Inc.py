#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Grass Seed Inc..py
# Date Created : 24/12/2019

cost = float(input())
N = int(input())

total = 0
for i in range(N):
    w, l = input().split()
    w, l = float(w), float(l)

    total += cost * (w*l)

print(format(total, '.8f'))