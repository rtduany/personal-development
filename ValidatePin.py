import re
def validate_pin(pin):
	pin = str(pin)
	match = re.search(r'^\d{4}$', pin)
	match2 = re.search(r'^\d{6}$', pin)
	if match or match2:
		return True
	else:
		return False
print validate_pin("123456a")
