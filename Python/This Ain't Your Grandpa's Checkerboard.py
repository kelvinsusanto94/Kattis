#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : This Ain't Your Grandpa's Checkerboard.py
# Date Created : 24/1/2020

N = int(input())

row = []
for i in range (N):
    row.append(input())

col = []
for i in range (N):
    S = ''
    for j in range (N):
        S = S + row[j][i]
    col.append(S)

count = []
found = False
for i in range (N):
    count.append(row[i].count('B'))
    count.append(col[i].count('B'))

if (len(set(count)) != 1):
    print (0)
else:
    for i in range (N):
        if ('BBB' in row[i] or 'WWW' in row[i]):
            found = True
            break
        if ('BBB' in col[i] or 'WWW' in col[i]):
            found = True
            break

    if (found == False):
        print (1)
    else:
        print (0)