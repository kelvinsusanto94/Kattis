#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Stacking Cups
# Date Created : 27/1/2020

N = int(input())

stack = []
colour = []
value = []
for i in range (N):
    S = input()

    first, second = S.split()

    if (first.isdigit()):
        value.append(int(first) // 2)
        colour.append(second)
    else:
        colour.append(first)
        value.append(int(second))

for i in range (N):
    index = value.index(min(value))
    stack.append(colour[index])
    value.pop(index)
    colour.pop(index)

print ('\n'.join(stack))