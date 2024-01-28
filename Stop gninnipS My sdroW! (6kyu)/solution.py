spin_words = lambda string: " ".join(I[::-1] if len(I) >= 5 else I for I in string.split())
