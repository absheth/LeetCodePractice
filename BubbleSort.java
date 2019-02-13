

class BubbleSort {

    public static void main(String[] args) {


        System.out.println();
        System.out.println("----- Starting -----");
        System.out.println();
        int arrayLength = 10;
        int array[] = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 49) + 1;
        }

        System.out.println("Before Sorting: ");
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
        }

        System.out.println("After Sorting: ");

        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
