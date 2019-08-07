# Checks to see if two strings are permutations of eachother
def isPermutation(a, b):
    if len(a) != len(b):
        return False
    a_s = sorted(a)
    b_s = sorted(b)
    for i in range(len(a_s)):
        if a_s[i] != b_s[i]:
            return False
    return True

assert isPermutation("cat", "act") == True
assert isPermutation("Aishwarya", "Karishma") == False
assert isPermutation("cat", "dog") == False
