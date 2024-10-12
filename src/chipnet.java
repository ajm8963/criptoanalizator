public class chipnet {

    public chipnet(){
    }
    public String encrypt(String text, int key){
        return analizator(text, key);
    }
    public String decrypt(String encryptedText, int key) {
        return analizator(encryptedText, -key);
    }
    public String analizator(String text, int shift){
        StringBuilder result = new StringBuilder();
        int sparekey ;
        int newkey ;
        char simvol;
        for (int i = 0; i < text.length(); i++) {
            if (shift > 127) {
                newkey = shift - 127;
                if(newkey > 26) {
                    sparekey = newkey % 26;
                    simvol = (char) (text.charAt(i) + sparekey);
                    result.append(simvol);
                }else{
                    simvol = (char) (text.charAt(i) + newkey);
                    result.append(simvol);
                    }
            }
        }
        return result.toString();
    }

}
