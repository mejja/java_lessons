public class BufferTest2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Major");
        
        buffer.append(' ');
        buffer.append("Mbandi");
        
        System.out.println(buffer.toString());
    }
}
