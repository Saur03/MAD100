public public static String caesarEncrypt(String text, int shift) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        if (Character.isUpperCase(ch)) {
            result.append((char) (((ch - 'A' + shift) % 26) + 'A'));
        } else if (Character.isLowerCase(ch)) {
            result.append((char) (((ch - 'a' + shift) % 26) + 'a'));
        } else {
            result.append(ch);  // Non-alphabet characters remain unchanged
        }
    }
    return result.toString();
}

System.out.println(caesarEncrypt("HELLO", 3));  // Outputs: "KHOOR"
 encryptusingcaesar {
    
}
