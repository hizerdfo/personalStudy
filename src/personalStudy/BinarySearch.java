package personalStudy;

public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] items = { "apple", "banana", "grape", "orange", "watermelon" };
        String target = "grape";
        int result = binarySearch(items, target, 0, items.length - 1);
        if (result == -1) {
            System.out.println("찾는 요소가 배열에 없습니다.");
        } else {
            System.out.println("찾는 요소의 인덱스: " + result);
        }
    }
    public static int binarySearch(String[] items, String target, int begin, int end) {
        if(begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);
            if(compResult == 0)
                return middle;
            else if (compResult < 0)
                return binarySearch(items, target, begin, middle-1);
            else
                return binarySearch(items,target,middle+1,end);
        }
    }
}
