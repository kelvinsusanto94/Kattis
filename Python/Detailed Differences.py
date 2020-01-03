#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Detailed Differences.py
# Date Created : 3/1/2020

N = int(input())

for i in range(N):
    S = input()
    T = input()

    print(S, '\n' + T)
    for i in range (len(S)):
        if (S[i] == T[i]):
            print('.', end="")
        else:
            print('*', end="")
    print('\n')