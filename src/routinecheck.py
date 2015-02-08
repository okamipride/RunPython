import time
import os.path

print("start time routine check") 

runcheck = True
# Check every checksec
checksec = 5
#filepath = "F:/Python/workspace/files/routinefilejava.txt"
filepath = "routinefilejava.txt"
while runcheck:  
    #f = open('F:/Python/workspace/files/routinefilejava.txt', 'w')
    fexist = os.path.isfile(filepath)
    if fexist :
        f = open(filepath, 'a')
    else:
        f = open(filepath, 'w')
    f.write('hi there\n') # python will convert \n to os.linesep
    f.close() # you can omit in most cases as the destructor will call if
    time.sleep(checksec)
    
    
