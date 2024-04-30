t = True

while t==True :
    a,b = map(int,input().split())
    if a==b==0 :
        t = False
    else :
        print(a+b)