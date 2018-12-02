double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int p, q, i, j;
    if (nums1Size < nums2Size) {
        p = 0;
        q = nums1Size;
    } else {
        p = (nums1Size - nums2Size) / 2;
        q = p + nums2Size;
    }

    while (p <= q) {
        i = (p + q) / 2;
        j = (nums1Size + nums2Size) / 2 - i;
        if (i < nums1Size && j > 0 && nums1[i] < nums2[j - 1]) {
            p = i + 1;
        } else if (i > 0 && j < nums2Size && nums1[i - 1] > nums2[j]) {
            q = i - 1;
        } else {
            break;
        }
    }

    double left, right;
    if (i == nums1Size) {
        right = nums2[j];
    } else if (j == nums2Size) {
        right = nums1[i];
    } else {
        right = nums1[i] < nums2[j] ? nums1[i] : nums2[j];
    }

    if ((nums1Size + nums2Size) % 2) {
        return right;
    }

    if (i == 0) {
        left = nums2[j - 1];
    } else if (j == 0) {
        left = nums1[i - 1];
    } else {
        left = nums1[i - 1] > nums2[j - 1] ? nums1[i - 1] : nums2[j - 1];
    }
    return (left + right) / 2;
}
