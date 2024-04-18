public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("\nTask 1");
        int[] decimal = new int[3];
        for (int i = 0; i < decimal.length; i++) {
            decimal[i] = i + 1;
            System.out.println(decimal[i]);
        }
        float[] floating = {1.57f, 7.654f, 9.986f};
        for (float v : floating) {
            System.out.println(v);
        }
        boolean[] yesOrNo = {true, false};

        //Task 2
        System.out.println("\nTask 2");
        for (int i = 0; i < decimal.length; i++) {
            if (i == decimal.length - 1) {
                System.out.print(decimal[i] + "\n");
            } else {
                System.out.print(decimal[i] + ", ");
            }
        }

        for (int i = 0; i < floating.length; i++) {
            if (i == floating.length - 1) {
                System.out.print(floating[i] + "\n");
            } else {
                System.out.print(floating[i] + ", ");
            }
        }

        for (int i = 0; i < yesOrNo.length; i++) {
            if (i == yesOrNo.length - 1) {
                System.out.print(yesOrNo[i] + "\n");
            } else {
                System.out.print(yesOrNo[i] + ", ");
            }
        }

        //Task 3
        System.out.println("\nTask 3");

        for (int i = decimal.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(decimal[i] + ", ");
            } else {
                System.out.print(decimal[i] + "\n");
            }
        }

        for (int i = floating.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(floating[i] + ", ");
            } else {
                System.out.print(floating[i] + "\n");
            }
        }

        for (int i = yesOrNo.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(yesOrNo[i] + ", ");
            } else {
                System.out.print(yesOrNo[i] + "\n");
            }
        }

        //Task 4
        System.out.println("\nTask 4");
        for (int i = 0; i < decimal.length; i++) {
            if (decimal[i] % 2 == 0 && i < decimal.length - 1) {
                System.out.print(decimal[i] + ", ");
            } else if (decimal[i] % 2 != 0 && i < decimal.length - 1){
                decimal[i] += 1;
                System.out.print(decimal[i] + ", ");
            } else if (decimal[i] % 2 == 0 && i == decimal.length - 1) {
                System.out.print(decimal[i]);
            } else if (decimal[i] % 2 != 0 && i == decimal.length - 1) {
                decimal[i] += 1;
                System.out.print(decimal[i]);
            }
        }
    }
}
