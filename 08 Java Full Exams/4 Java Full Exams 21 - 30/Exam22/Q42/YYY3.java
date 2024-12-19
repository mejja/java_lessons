class YYY3 extends XXX {
    public void m() {
    }

    public static void main(String[] args) throws Exception { // Declare that main throws Exception
        XXX obj = new XXX();
        obj.m(); // This call can throw an exception
    }
}

class XXX {
    public void m() throws Exception {
        throw new Exception("An exception occurred in XXX.m()");
    }
}
