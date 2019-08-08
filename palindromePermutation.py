# Given a string, write a function to check if it is a permutation of a palindrome

def pp(str):
    s_s = sorted(str)
    odd_instances = False
    curr_letter = s_s[0]
    curr_instances = 1
    for i in range(1, len(s_s)):
        if s_s[i] == curr_letter:
            curr_instances += 1
        else:
            if curr_instances % 2 == 1:
                if odd_instances:
                    return False
                odd_instances = True
            curr_instances = 1
            curr_letter = s_s[i]
        return True

assert pp("tact coa") == True
