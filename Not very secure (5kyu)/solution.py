def alphanumeric(string: str):
    if string == "": return False

    passed_symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for i in string.upper():
        if passed_symbols.find(i) == -1: return False

    return True
