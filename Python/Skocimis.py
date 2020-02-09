#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Skocimis.py
# Date Created : 29/1/2020

A, B, C = map(int, input().split())

arr = []
arr.append(C - B)
arr.append(B - A)

print (max(arr) - 1)