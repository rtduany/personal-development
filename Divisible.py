#Create a function isDivisible(n,...) that checks if the first #agrument n is divisible by all other arguments (return true if no #other arguments)
#define function isDivisible that takes 4 parameters
def isDivisible(n,x,y,z):
	#use mod in if statement to check for divisibility
	if (n % x == 0) and (n % y == 0) and (n % z == 0):
		return True
	else:
		return False
#do some printing
print isDivisible(8,1,2,4)
