public static void main(String[] ignoredArgs) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of the array ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to be searched: ");
    int target = sc.nextInt();
    int mila = binarysearch(arr, 0, n - 1, target);
    if (mila == -1)
        System.out.println("Element not found");
    else
        System.out.println("Element found at index " + (mila + 1));
    // printf("%d",mila+1);
}

public static int binarysearch(int[] arr, int low, int high, int target) {
    int mid = (low + high) / 2;
    if (high < low)
        return -1;
    if (arr[mid] == target)
        return mid;
    else if (target < arr[mid])
        return binarysearch(arr, low, mid - 1, target);
    else
        return binarysearch(arr, mid + 1, high, target);


}

