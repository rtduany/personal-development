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
#define function that takes in 1 parameters eggs (non-negative)
def cooking_time(eggs):
	#tests for negativity
	if eggs >= 0:
		#in the case not needing a mod calculation
		if eggs <= 8:
			time = eggs * 5
		#in the case needing a mod calculation
		else:
			#mod calculation implemented via divmod module
			y = divmod(eggs, 8)
			time = (y[0]*5) + 5
		return time
print cooking_time(25)
