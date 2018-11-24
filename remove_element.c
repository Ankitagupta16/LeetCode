int removeElement(int* nums, int numsSize, int val) {
    if(numsSize==0)
        return 0;
    int i,j=0;
    
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]!=val)
        {nums[j]=nums[i];
         j++;
    }}
    if(j<numsSize)
        nums[j]='\0';
    return j;
}
