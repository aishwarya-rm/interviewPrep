class moveZerosToEnd {
    public static void main(String[] args) {
        int[] test = new int[]{0, 1, 0, 3, 12};
        moveZerosToEnd(test);
    }
    public static void moveZerosToEnd(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            int eltI = arr[i];
            int eltJ = arr[j];
            if(eltI == 0) {
                if(eltJ == 0) {
                    j += 1;
                }
                else {
                    arr[i] = eltJ;
                    arr[j] = 0;
                    i += 1;
                    j += 1;
                }
            }
            else {
                i += 1;
                j += 1;
            }
        }
    }
}
