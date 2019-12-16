#   .-"-.
#  /|6 6|\
# {/(_0_)\}
#  _/ ^ \_
# (/ /^\ \)-'
#  ""' '""     하늘

# written by
# @author Wolverine 왕경민

# File Name : Odd Man Out
# Date Created : 14/12/2019

N = int(input())

for i in range (N):
    _ = int(input())
    G = input().split()
    List = [int(j) for j in G]
    List.sort()

    found = False
    print("Case #", end="")
    print(i+1, end="")
    print(":", end=" ")
    for k in range(0, len(List) - 1, 2):
        if (List[k] != List[k + 1]):
            print(List[k])

            found = True
            break

    if (found == False):
        print(List[-1])