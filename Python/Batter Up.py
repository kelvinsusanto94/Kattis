#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Batter Up.py
# Date Created :  4/1/2020

N = int(input())
arr = map(int, input().split())

arr = [i for i in arr if i != -1]
print(sum(arr)/len(arr))