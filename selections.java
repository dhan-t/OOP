import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void selection() {
        System.out.println(
                "Choose a figure below: \n(a). Square \n(b). Left Half Triangle \n(c). Inverted Left Half Triangle \n(d). Left Hollow Half Triangle \n(e). Inverted Left Hollow Half Triangle \n(f). Right Half Triangle \n(g). Inverted Right Half Triangle \n(h). Right Hollow Half Triangle \n(i). Inverted Right Hollow Half Triangle \n(j). Full Triangle \n(k). Inverted Full Triangle \n(l). Full Hollow Triangle \n(m). Inverted Full Hollow Triangle \n(n). Half Left Diamond \n(o). Half Right Diamond ");
        char chosenFigure = sc.next().charAt(0);
        String lowercaseStr = String.valueOf(chosenFigure).toLowerCase();
        switch (lowercaseStr) {
            case "a":
                System.out.println("Input n: ");
                String result = square();
                System.out.print(result);
                break;
            case "b":
                System.out.println("Input n: ");
                String result1 = leftHalfTriangle();
                System.out.print(result1);
                break;
            case "c":
                System.out.println("Input n: ");
                String result2 = invertedLeftHalfTriangle();
                System.out.print(result2);
                break;
            case "d":
                System.out.println("Input n: ");
                String result3 = leftHollowHalfTriangle();
                System.out.print(result3);
                break;
            case "e":
                System.out.println("Input n: ");
                String result4 = invertedLeftHollowHalfTriangle();
                System.out.print(result4);
                break;
            case "f":
                System.out.println("Input n: ");
                String result5 = rightHalfTriangle();
                System.out.print(result5);
                break;
            case "g":
                System.out.println("Input n: ");
                String result6 = invertedRightHalfTriangle();
                System.out.print(result6);
                break;
            case "h":
                System.out.println("Input n: ");
                String result7 = rightHollowHalfTriangle();
                System.out.print(result7);
                break;
            case "i":
                System.out.println("Input n: ");
                String result8 = invertedRightHollowHalfTriangle();
                System.out.print(result8);
                break;
            case "j":
                System.out.println("Input n: ");
                String result9 = fullTriangle();
                System.out.print(result9);
                break;
            case "k":
                System.out.println("Input n: ");
                String result10 = invertedFullTriangle();
                System.out.print(result10);
                break;
            case "l":
                System.out.println("Input n: ");
                String result11 = fullHollowTriangle();
                System.out.print(result11);
                break;
            case "m":
                System.out.println("Input n: ");
                String result12 = invertedFullHollowTriangle();
                System.out.print(result12);
                break;
            case "o":
                System.out.println("Input n: ");
                String result13 = halfLeftDiamond();
                System.out.print(result13);
                break;
            case "p":
                System.out.println("Input n: ");
                String result14 = halfLeftHollowDiamond();
                System.out.print(result14);
                break;
            default:
                break;
        }

    }

    public static String square() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();

        for (int r = 1; r <= n; r = r + 1) {
            output.append("\n");
            for (int c = 1; c <= n; c = c + 1) {
                output.append("*");
            }
        }
        return output.toString();
    }

    public static String leftHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; ++c) {
                output.append("*");
            }
            output.append("\n");
        }
        return output.toString();
    }

    public static String invertedLeftHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= r; ++c) {
                output.append("* ");
            }
            output.append("\n");
        }
        return output.toString();
    }

    public static String leftHollowHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; ++c) {
                if (c == 1 || r == n || c == r) {
                    output.append("* ");
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");
        }
        return output.toString();
    }

    public static String invertedLeftHollowHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= r; ++c) {
                if (c == 1 || r == n || c == r) {
                    output.append("* ");
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");
        }
        return output.toString();
    }

    public static String rightHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= n; r++) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");

            }
            for (int o = 1; o <= r; ++o) {
                output.append("* ");
            }

            output.append("\n");
        }
        return output.toString();
    }

    public static String invertedRightHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = n; r >= 1; r--) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r; ++o) {
                output.append("* ");
            }
            output.append("\n");
        }
        return output.toString();
    }

    public static String rightHollowHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= 1; r++) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r; ++o) {
                if (o == 1 || r == n || o == r) {
                    output.append("* ");
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");

        }
        return output.toString();
    }

    public static String invertedRightHollowHalfTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = n; r >= 1; r--) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r; ++o) {
                if (o == 1 || r == n || o == r) {
                    output.append("* ");
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");

        }
        return output.toString();
    }

    public static String fullTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = n; r <= 1; r++) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r * 2 - 1; ++o) {
                output.append("* ");
            }
            output.append("\n");

        }
        return output.toString();
    }

    public static String invertedFullTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r == n; r--) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r * 2 - 1; ++o) {
                output.append("* ");
            }
            output.append("\n");

        }
        return output.toString();
    }

    public static String fullHollowTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r == 1; r++) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r * 2 - 1; ++o) {
                if (o == 1 || r == n || o == r) {
                    output.append("* ");
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");

        }
        return output.toString();
    }

    public static String invertedFullHollowTriangle() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r == n; r--) {
            for (int s = n; s >= r; s -= 1) {
                output.append(" ");
            }
            for (int o = 1; o <= r * 2 - 1; ++o) {
                if (o == 1 || r == n || o == r * 2 - 1) {
                    output.append("* ");
                } else {
                    output.append(" ");
                }
            }
            output.append("\n");

        }
        return output.toString();
    }

    public static String halfLeftDiamond() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= n / 2; r++) {
            for (int o = 1; o <= r; ++o) {
                output.append("* ");
            }
            output.append("\n");

            for (int s = n / 2 + 1; s >= 1; r--) {
                output.append("* ");
            }
            for (int o = 1; o <= r; o++) {
                System.out.println("* ");
            }
        }
        output.append("\n");

        return output.toString();
    }

    public static String halfLeftHollowDiamond() {

        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int r = 1; r <= n / 2; r++) {
            for (int o = 1; o <= r; ++o) {
                output.append("* ");
            }
            output.append("\n");

            for (int s = n / 2 + 1; s >= 1; r--) {
                output.append("* ");
            }
            for (int o = 1; o <= r; o++) {
                System.out.println("* ");
            }
        }
        output.append("\n");

        return output.toString();
    }

    public static void main(String[] args) {

        selection();

    }

}
