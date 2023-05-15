package BasicDS.Question7;

public class Question7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        if (SearchArray.searchArray(arr,valueToCheck)) {
            System.out.println("element present");
        }
        else {
            System.out.println("element not present");
        }
    }
}
