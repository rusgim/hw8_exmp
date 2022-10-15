public class Main {
    public static void main(String[] args) {
        //задание 1, 2
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[0] + "," + number[1] + "," + number[2]);
        System.out.println(" ");
        double[] fractionalNumbers = new double[]{1.57, 7.654, 9.986};
        System.out.print(fractionalNumbers[0] + "," + fractionalNumbers[1] + "," + fractionalNumbers[2]);
        System.out.println(" ");
        int[] random = {1, 78, 0};
        for (int i = 0; i < random.length; i++) {
            if (i < random.length - 1) {
                System.out.print(random[i] + ",");
            } else {
                System.out.print(random[i]);
            }
        }
        //задача 3
        System.out.println(" ");
        for (int k = 2; k >= 0; k--) {
            if (k > 0) {
                System.out.print(random[k] + ",");
            } else {
                System.out.print(random[k]);
            }
        }
        System.out.println(" ");
        for (int m = 2; m >= 0; m--) {
            if (m > 0) {
                System.out.print(fractionalNumbers[m] + ",");
            } else {
                System.out.print(fractionalNumbers[m]);
            }
        }
        System.out.println("");
        for (int l = 2; l >= 0; l--) {
            if (l > 0) {
                System.out.print(number[l] + ",");
            } else {
                System.out.print(number[l]);
            }
        }
        //задание 4
        System.out.println("");
        for (int g = 0; g < number.length; g++) {
            if (number[g] % 2 != 0) {
                number[g] = number[g] + 1;
                System.out.println(number[g]);
            } else {
                System.out.println(number[g]);
            }
        }

    }
}