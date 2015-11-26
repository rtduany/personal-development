#create a function powers that takes an array, and returns the number #of subsets possible to create from that list. In other words, counts #the power sets.
#For instance
#powers([1,2,3]) =&gt; 8

def powerset(x):
    for i in reduce(lambda s,e:s+[i+[e] for i in s],x,[[]]):print i
powerset([1,2,3])
