#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Mjehuric.py
# Date Created : 30/1/2020

arr = list(map(int, input().split()))

while (arr != [1, 2, 3, 4, 5]):
    for i in range (4):
        if (arr[i] > arr[i+1]):
            arr[i], arr[i+1] = arr[i+1], arr[i]
            print (*arr)