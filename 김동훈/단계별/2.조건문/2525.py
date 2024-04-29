h, m = map(int,input().split())
c = int(input())

ch = c//60
cm = c%60

if m+cm >= 60 :
    if h+ch+1>=24 :
        print(h+ch-23,m+cm-60)
    else :
        print(h+ch+1,m+cm-60)
else :
    if h+ch>=24:
        print(h+ch-24,m+cm)
    else :
        print(h+ch,m+cm)