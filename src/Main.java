public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1, 2");
        int[] weight = {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }

        double[] weight1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight1.length; i++) {
            if (i == weight1.length - 1) {
                System.out.println(weight1[i]);
                break;
            }
            System.out.print(weight1[i] + ", ");
        }

        int[] weight2 = {10, 12, 14};
        for (int i = 0; i < weight2.length; i++) {
            if (i == weight2.length - 1) {
                System.out.println(weight2[i]);
                break;
            }
            System.out.print(weight2[i] + ", ");
        }

        System.out.println("Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = weight1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight1[i]);
                break;
            }
            System.out.print(weight1[i] + ", ");
        }
        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight2[i]);
                break;
            }
            System.out.print(weight2[i] + ", ");
        }
        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
        }
        System.out.println(java.util.Arrays.toString(weight));
    }
}



