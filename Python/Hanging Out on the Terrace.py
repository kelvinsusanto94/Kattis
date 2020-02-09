#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Hanging Out ont the Terrace.py
# Date Created : 23/1/2020

L, T = map(int, input().split())

denied, entry = 0, 0
for i in range (T):
    S = input().split()

    if (S[0] == 'enter'):
        if (entry + int(S[1]) <= L):
            entry += int(S[1])
        else:
            denied += 1

    else:
        entry -= int(S[1])

print (denied)