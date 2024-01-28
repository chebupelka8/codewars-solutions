def find_missing_letter(char):
    alphabet = "abcdefghijklmnopqrstuvwxyz"

    if "".join(char).isupper():
        array = [i.lower() for i in char]
    else:
        array = char

    start, end = alphabet.index(array[0]), alphabet.index(array[-1])

    range_ = [i for i in alphabet[start:end + 1]]

    for letter in range_:
        if not letter in array:
            return letter.upper() if "".join(char).isupper() else letter

    return None
