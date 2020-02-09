#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Free Food.py
# Date Created : 27/1/2020

N = int(input())

days = []
for i in range (N):
    start, stop = map(int, input().split())

    for j in range (start, stop+1, 1):
        days.append(j)

days = set(days)
print (len(days))