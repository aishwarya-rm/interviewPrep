# Implement a function to determine if a string has all unique characters. 
def isUnique(str):
    #sort
    sorted_str = sorted(str)
    for i in range(1, len(sorted_str)):
	if sorted_str[i] == sorted_str[i-1]:
	    return False
    return True

print(str(isUnique("Aishwarya")))
print(str(isUnique("abcde")))
