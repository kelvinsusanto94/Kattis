#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Quadrant Selection.py
# Date Created : 24/12/2019

x, y = int(input()), int(input())

if (x > 0):
    print('1') if y>0 else print('4')
else:
    print('2') if y>0 else print('3')