char* reverseOnlyLetters(char* S) {
    char* start = S;
    char* end = S + strlen(S)-1;
    
    while(start < end)
    {
        if((*start >= 'a' && *start <='z') || (*start >= 'A' && *start <= 'Z'))
        {
            if((*end >= 'a' && *end <='z') || (*end >= 'A' && *end <= 'Z'))      
            {
                //Swap
                char temp;
                temp = *start;
                *start = *end;
                *end = temp;
                start++;
                end--;
            }
            else
            {
                end--;
            }
        }
        else
        {
            start++;
        }
    }
    return S;
}
