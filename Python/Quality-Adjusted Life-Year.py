#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Quality-Adjusted Life-Year.py
# Date Created : 24/12/2019

N = int(input())

total = 0
for i in range(N):
    x, y = input().split()
    x, y = float(x), float(y)
    total += (x * y)

print(format(total, '.3f'))