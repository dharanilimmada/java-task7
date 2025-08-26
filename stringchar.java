class Main {
    public static void main(String[] args) {
        String str1 = "my name is chintu";
        String str2 = "";

        str2 += (str1.charAt(0) + "").toUpperCase();

        for (int i = 1; i < str1.length(); i++) {
            if (str1.charAt(i - 1) == ' ') {
                str2 += (str1.charAt(i) + "").toUpperCase();
            } else {
                str2 += str1.charAt(i);
            }
        }

        System.out.println(str2);
    }
}
