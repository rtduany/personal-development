#define a unique function that takes 1 parameter
def unique(integers):
	#use the set() module to remove duplicates from the integers
	#sequence. construct a new set object and assign to seen
    seen = set()
	#set up a vraiable for seen.add(x) operation
	#add element x to set seen
    seen_add = seen.add
	#use set operation to ensure the set is unique or remove
	#duplicates
    return [x for x in integers if x not in seen and not seen_add(x)]
print unique([1, 5, 2, 0, 2, -3, 1, 10])
