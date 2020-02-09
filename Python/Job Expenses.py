#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Job Expenses.py
# Date Created : 27/1/2020

N = int(input())

S = list(map(int, input().split()))

index = 0
for i in range (N):
    if (S[index] > 0):
        S.pop(index)
    else:
        index += 1

print(abs(sum(S)))