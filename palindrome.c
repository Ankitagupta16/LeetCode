bool isPalindrome(int x) {
	int size = 1;
    char *str;
    
	if (x >= 0 && x <= 9)
        return (true);
    if (x < 0)
        return (false);
    else {
        for (int nb2 = x; nb2 >= 10; nb2 /= 10)
            size++;
        str = malloc(sizeof(char) * (size + 1));
        for (int i = 0; i <= size; i++)
            str[i] = '\0';
        for (int j = 1; x > 0 ; j++) {
            str[size - j] =  x % 10 + '0';
            x /= 10;
        }
    }
    char *str2 = malloc(sizeof(char) * (size + 1));
     for (int i = 0; i <= size; i++)
        str2[i] = '\0';
    int i = strlen(str) - 1;
    for (int j = 0; i >= 0; i--, j++) {
        str2[j] = str[i];
    }
    if (strcmp(str, str2) == 0)
        return (true);
    return (false);
}
