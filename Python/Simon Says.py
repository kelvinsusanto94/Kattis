#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Simon Says
# Date Created : 15/21/2019

N = int(input())

for i in range (N):
    T = input()
    if ("Simon says" in T):
        print(T[11:])