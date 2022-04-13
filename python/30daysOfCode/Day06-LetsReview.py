# Enter your code here. Read input from STDIN. Print output to STDOUT
N=int(input())

for words in range(N):
    S=input()
    x=list(S)
    for even in range(len(x)):
        if even%2==0:
            print(x[even], end="")
    
    print(end=" ")
    
    for odd in range(len(x)):
        if(odd%2!=0):
            print(x[odd], end="")
            
    print()