public class testing_class {

    static int gcdNum(int a, int b) {
        if (a == 0)
            return b;

        return gcdNum(b % a, a);

    }

    static int getArrayGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
        {
            result = gcdNum(arr[i], result);

            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = { 12, 20, 36};
        int n = arr.length;
        System.out.println(getArrayGCD(arr, n));

    }
}
