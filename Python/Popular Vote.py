#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Popular Vote
# Date Created : 16/12/2019

T = int(input())

for i in range (T):
    n = int(input())

    max, tvotes, winnner = 0, 0, 0
    repeat = False
    for j in range (n):
        x = int(input())
        tvotes += x

        if (max <= x):
            if (max != x):
                max = x
                winner = j+1
                repeat = False
            elif (max == x):
                repeat = True

    if (repeat == True):
        print ('no winner')
    elif (max > tvotes // 2):
        print ('majority winner', winner)
    else:
        print('minority winner', winner)
