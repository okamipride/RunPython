import time

print("start time routine check") 

runcheck = True
# Check every checksec
checksec = 10

while runcheck:  
    #f = open('F:/Python/workspace/files/routinefilejava.txt', 'w')
    f = open('routinefilejava.txt', 'a')
    f.write('hi there\n') # python will convert \n to os.linesep
    f.close() # you can omit in most cases as the destructor will call if
    time.sleep(checksec)
    
    
