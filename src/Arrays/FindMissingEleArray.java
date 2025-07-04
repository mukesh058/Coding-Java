package Arrays;

public class FindMissingEleArray {

    public static void main(String[] args) {
        
        int array[] = {1, 3, 5, 7, 9, 0};

        for (int i = 0; i <= 10; i++) {
            boolean found = false;

            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing element: " + i);
            }
        }
    }
}
