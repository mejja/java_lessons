class YYY2 extends XXX {
    public void m() { // This overrides m() from XXX without throwing any checked exceptions
    }

    public static void main(String[] args) {
        XXX obj = new XXX(); // obj an instance of XXX
        try {
            obj.m(); // Calls the overridden method in YYY
        } catch (Exception e) {
            // Handle the exception thrown by XXX.m()
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class XXX {
    public void m() throws Exception { // This method throws a checked exception
        throw new Exception("An exception occurred in XXX.m()");
    }
}
