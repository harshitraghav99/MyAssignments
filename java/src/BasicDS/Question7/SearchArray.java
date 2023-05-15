package BasicDS.Question7;

class SearchArray {
    static boolean searchArray(int[] arr,int toCheckValue){
        for (int j : arr) {
            if (toCheckValue == j) {
                return true;
            }
        }
        return false;
    }
}
