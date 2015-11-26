#Implement a function, which takes a non-negative integer, #representing the number of eggs to boil. It must return the time in #minutes (integer), which it takes to have all the eggs boiled.

#Rules

#you can put at most 8 eggs into the pot at once
#it takes 5 minutes to boil an egg
#we assume, that the water is boiling all the time (no time to heat #up)
#for simplicity we also don't consider the time it takes to put eggs #into the pot or get them out of it
#Example

#cooking_time 0 # must return 0
#cooking_time 5 # must return 5
#cooking_time 10 # must return 10

def BoiledEgg(number_of_eggs):
	isPositiveNum=lambda x: (isinstance(x, int) and x>0) or False
	b = 8;
	while isPositiveNum(number_of_eggs):
		if number_of_eggs <= b:
			time = number_of_eggs * 5
		else:
			y = divmod(number_of_eggs, b)
			time = (y[0]*5) + (y[1])
	return time
print BoiledEgg(15)

