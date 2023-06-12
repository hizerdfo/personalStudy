package personalStudy;

public class findMax {

    public static void main(String[] args) {
        int[] data = { 5, 2, 9, 1, 7 };
        int max = findMax2(data, 0, data.length - 1);
        System.out.println("Max: " + max);
    }

    public static int findMax(int[] data, int begin, int end) {
        if (begin == end) {
            return data[begin];
        } else {
            int mid = (begin + end) / 2;
            int leftMax = findMax(data, begin, mid);
            int rightMax = findMax(data, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }
    
    
    public static int findMax2 (int[] data, int begin, int end) {
        if(begin == end)
            return data[begin];
        else
        {
            int middle = (begin+end)/2;
            int max1 = findMax(data, begin, middle);
            int max2 = findMax(data, middle + 1, end);
            return Math.max(max1, max2);
        }
    }
}