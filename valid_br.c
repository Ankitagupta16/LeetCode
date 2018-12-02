bool isValid(char* s) {
    char *stack;
    int len = strlen(s);
    
    if (len % 2) return false;
    
    stack = (char*)(malloc(sizeof(char) * len));
    stack[0] = '\0';
    
    while (*s) {
        if ( *s == '(' || *s == '{' || *s == '[') {
            *++stack = *s;
        } else {
            if (!*stack) return false;
            switch (*s) {
                case ')':
                    if (*stack != '(') return false;
                    else stack--;
                    break;
                case '}':
                    if (*stack != '{') return false;
                    else stack--;
                    break;
                case ']':
                    if (*stack != '[') return false;
                    else stack--;
                    break;
            }
        }
        s++;
    }
    return (*stack) ? false : true;    
}
