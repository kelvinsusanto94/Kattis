#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Symmetric Order.py
# Date Created : 5/1/2020

count = 0
while (True):
    N = int(input())
    if (N == 0):
        break
    else:
        count += 1

    arr = []
    for i in range(N):
        arr.append(input())

    arr.sort(key=len)
    if (N % 2 == 1):
        arr.append('')

    pair = list(zip(arr[::2], arr[1::2]))

    print('SET', count)
    for j in range(len(pair)):
        print(pair[j][0])
    for j in range(len(pair)-1, -1, -1):
        if (pair[j][1] == ''):
            continue
        print(pair[j][1])