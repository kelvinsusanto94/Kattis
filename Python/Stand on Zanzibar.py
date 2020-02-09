#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Stand on Zanzibar.py
# Date Created : 16/1/2020

N = int(input())

for i in range (N):
    S = input().split()
    arr = [int(i) for i in S]

    total = 0
    for i in range(len(arr)-1):
        if (arr[i+1] < arr[i] * 2):
            continue

        total += (arr[i+1] - arr[i]*2)

    print (total)