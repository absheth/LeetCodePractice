
class InsertionSort {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----- Starting -----");
        System.out.println();
        int ALength = 10;
        int A[] = new int[ALength];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 49) + 1;
        }

        System.out.println("Before sorting: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int current;
        int i, j;
        for (i = 0; i < A.length; i++) {
            current = A[i];
            for (j = i - 1; j >= 0 && A[j] > current ; j--) {
                A[j+1] = A[j];
            }
            A[j+1] = current;
        }

        System.out.println("After sorting: ");
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }
}
