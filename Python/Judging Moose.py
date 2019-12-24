#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Judging Moose
# Date Created : 24/12/2019

l, r = input().split()
l, r = int(l), int(r)

if (l==0 and r==0):
    print('Not a moose')
elif(l==r):
    print('Even', l*2)
else:
    print('Odd', max(l, r)*2)