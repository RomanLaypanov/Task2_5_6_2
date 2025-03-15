import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {(byte) '1', (byte) '@', (byte) 'i', (byte) 'H'};
        AsciiCharSequence s = new AsciiCharSequence(bytes);

        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.subSequence(0, 3));
        System.out.println(s.toString());
    }

    public static class AsciiCharSequence implements CharSequence {
        byte[] bytes;

        AsciiCharSequence(byte[] bytes) {
            this.bytes = bytes;
        }

        @Override
        public int length() {
            return bytes.length;
        }

        @Override
        public char charAt(int index) {
            return (char) bytes[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(bytes, start, end));
        }

        @Override
        public String toString() {
            return new String(bytes);
        }
    }
}