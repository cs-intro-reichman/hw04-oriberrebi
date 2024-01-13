public class ArrayOps {
    public static void main(String[] args) {
        int [] arrayX = {2, 2, 3, 7, 8, 3, 2};
        int [] arrayZ = {8, 2, 7, 7, 3};

        ///

        int result = findMissingInt(arrayX);
        System.out.println(result);
         
        ///

        int max1 = secondMaxValue(arrayX);
        System.out.println(max1);

        ///

        boolean element = containsTheSameElements(arrayX, arrayZ);
        System.out.println(element);

        ///

        boolean sort = isSorted(arrayX);
        System.out.println(sort);
    }

    public static int findMissingInt (int [] array) {
        int sum = 0;
        int sumA = 0;

        for (int i = 0; i <array.length+1; i++) {
            sum = sum + i;
            }
        // loop for sum of array
        for (int i = 0; i < array.length; i++) {
            sumA = sumA + array[i];
        }
            return (sum - sumA);
    }


    public static int secondMaxValue(int [] array) {
        int maxN = 0;
        int max1 = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > maxN){
                maxN = array[i];
            }
            if (array[i] != maxN) {
                if (array[i] > max1) {
                    max1 = array[i];
                }
            }
        }
        return max1;

    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean elementS = false;
        for (int i = 0; i < array1.length; i++){
            elementS = false;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    elementS = true;
                    break;
                }
            }

            if (!elementS) {
                return false;
        }
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean sortA = false;
        boolean sortD = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[(i+1)]) {
                i++;
            }
            if (array[i] > array[i+1]) {
                sortA = true;
            }
            if (array[i] < array[i+1]) {
                sortD = true;
            }
        }
        return sortA != sortD;
    }

}
