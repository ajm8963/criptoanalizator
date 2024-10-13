public class chipnet {
    public String encrypt(String text, int key) {
        return analizator(text, key);
    }

    public String decrypt(String encryptedText, int key) {
        return analizator(encryptedText, -key);
    }

    public String analizator(String text, int shift) {
        StringBuilder result = new StringBuilder();
            int newshift = shift % 26;
            for (int i = 0; i < text.length(); i++) {
                int rangezone = (text.charAt(i) + newshift);{
                    if (rangezone > 127) {
                        rangezone = (rangezone - 126) + 96;
                    }
                }
                result.append((char) rangezone);
            }
            return result.toString();
        }
    }

