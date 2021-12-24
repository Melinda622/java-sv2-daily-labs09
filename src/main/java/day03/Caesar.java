package day03;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        input=input.toUpperCase();
            StringBuilder sb=new StringBuilder();
        for (int i = 0; i <input.length() ; i++) {
            if((input.charAt(i)+offset)>90){
                sb.append((char) ((input.charAt(i)+offset)-26));
            }else{
                sb.append((char) (input.charAt(i)+offset));
            }
        }
        return sb.toString();
    }
}
