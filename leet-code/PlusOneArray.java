import java.util.*;
class PlusOneArray {
    public int[] plusOne(int[] digits) {
        // int[] returnArray = new int[digits.length];
        ArrayList<Integer> returnArray = new ArrayList<Integer>();
        boolean addOne = false;
        for (int i = digits.length - 1; i >= 0 ; i--) {
            int temp;
            if (i == digits.length - 1 ) {
                temp = digits[i] + 1;
                if (temp == 10) {
                    addOne = true;
                    returnArray.add(0);
                } else {
                    returnArray.add(temp);
                }
            } else {
                if (addOne) {
                    temp = digits[i] + 1;
                    if(temp != 10) {
                        addOne = false;
                        returnArray.add(temp);
                    } else {
                        returnArray.add(0);
                    }
                } else {
                    returnArray.add(digits[i]);
                }
            }
        }
        if (addOne) {
            returnArray.add(1);
        }
        int[] ret = new int[returnArray.size()];
        for (int i=ret.length-1; i >= 0; i--) {
            ret[ret.length-1-i] = returnArray.get(i).intValue();
        }
        return ret;
    }
}
