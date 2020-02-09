#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Honour Thy (Apaxian) Parent.py
# Date Created : 28/1/2020

vowel = ['a', 'i', 'e', 'u', 'o']

Y, P = input().split()

if (Y[-2:] == 'ex'):
    print (Y + P)
elif (Y[-1] in vowel):
    print (Y[0:-1] + 'ex' + P)
else:
    print (Y + 'ex' + P)