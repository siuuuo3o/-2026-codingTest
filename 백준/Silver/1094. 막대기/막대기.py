#백준 1094: 막대기
stick = int(input())
count = 0
stickLength = [64, 32, 16, 8, 4, 2, 1]

for i in range(len(stickLength)):
    if (stickLength[i] <= stick):
        stick -= stickLength[i]
        count += 1

    if (stick == 0):
        break
print(count)