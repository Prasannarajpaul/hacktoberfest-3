public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        for (int i = 0; i < helloWorld.length(); i++) {
            for (int j = 0; j < helloWorld.length(); j++) {
                if (j == 0) {
                    System.out.print(helloWorld.charAt(i) + " ");
                } else if (i == helloWorld.length() - 1) {
                    System.out.print(helloWorld.charAt(helloWorld.length() - j - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
