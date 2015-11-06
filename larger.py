# Make larger number
# Solve the problem below using PYTHON
# Given a number whose digits are unique, find the next larger number that can be formed with those digits.
# For example: 241 will output 421, 27 will output 72 and 68734 will outyput 87643

def larger(x):
	return int("".join((sorted(x, reverse=True))))
print larger("68734")
