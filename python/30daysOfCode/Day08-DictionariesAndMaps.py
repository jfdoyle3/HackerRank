# Enter your code here. Read input from STDIN. Print output to STDOUT
N=int(input())
phoneBook={}
for entries in range(N):
    name=input()
    entry=name.split()
    phoneBook[entry[0]]=entry[1]

for queries in range(N):
    query=input()
    if phoneBook.get(query):
        print(query+"="+phoneBook.get(query))
    else:
        print("Not found")