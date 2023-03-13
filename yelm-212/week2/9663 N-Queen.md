```
N = int(input())

cnt = 0
queen = [0] * N

def promising(x):
    for i in range(x):  # 같은 열이거나 대각선상에 위치
        if queen[x] == queen[i] :
            return False
        elif abs(queen[x] - queen[i]) == x-i: 
            return False
    return True

def nqueen(x):
    global cnt
    if x == N:
        cnt +=1
        return
    
    else:
        for i in range(N):
            queen[x] = i
            if promising(x):
                nqueen(x+1)

nqueen(0)
print(cnt)
```