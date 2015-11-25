#ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot #contain anything but exactly 4 digits or exactly 6 digits.

#If the function is passed a valid PIN string, return true, else #return false.

#eg:

#validate_pin("1234") == True
#validate_pin("12345") == False
#validate_pin("a234") == False

#import regular expression (re)
import re
#define our validate_pin(pin) function that takes 1 parameter (pin)
def validate_pin(pin):
	#in case of other input from user, turn it into string
	pin = str(pin)
	#define a couple of matches with pattern and our pin parameters
	match = re.search(r'^\d{4}$', pin)
	match2 = re.search(r'^\d{6}$', pin)
	#a match if statements which validates our pin
	if match or match2:
		return True
	else:
		return False
#pint the result
print validate_pin("123456a")
