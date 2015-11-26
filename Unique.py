def unique(integers):
    seen = set()
    seen_add = seen.add
    return [x for x in integers if x not in seen and not seen_add(x)]
print unique([1, 5, 2, 0, 2, -3, 1, 10])
