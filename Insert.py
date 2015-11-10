# Dash Insert
# Using python, have the function DashInsert(str) insert dashes ('-') between each two odd numbers in string.
# For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number.
def DashInsert(str):
	#first lets iterate thru the function
	for i in str:
		#turn the string to int
		i = int(i)
		#check if the incoming argument or i is odd
		if (i % 2 != 0):
			str.append("-")
	return str
print DashInsert("454793")
