import re


f =open("cprogram7.c","r")

data = ["#include<stdio.h>"]

operators = ["+","*","=","<",">"]

seperators = [";",",","{","}","(",")"]

keyword = ["for","if","else","while"]

datatype = ["int","void","char"]

main = ["main"]

data1 = ["printf","scanf","getchar"]

library1 = '[^[a-z]$]'


library2 = '[^a...z$]'


library3 = '^[a-z]*'


a = f.readline()
#print(a)
while True:
    
    for i in a.split():
        print("\ntoken is : ",i)
        if i in data:
            pass
           # print("\n library file is : ",i)
        
        if i not in datatype and i not in seperators and i not in operators and i not in main and i not in data and i not in data1:
            print("\nidentifier : ",i)

        for d in datatype:
            if d == i:
                print("\ndatatype is : ",i)

        for s in operators:
            if s==i:
                print("\noperators is given as : ",s)

       
     #   for a in library3:
      #      if q == i:
       #         print(q)
                
         
    
                

        for k in seperators:
            if k==i:
                print("\nseperators is given as : ",k)
        for w in main:
            
            if i == w:
                print("\nmethod is : ",i)
        for q in data1:
            if q == i:
                print(": ", i)
            
    a = f.readline()   
      
    
f.close()    

	          
