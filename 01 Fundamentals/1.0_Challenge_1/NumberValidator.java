public class NumberValidator{
    public static boolean numIsValid(String distance_from_store) {
    int intValue;
        
    if(distance_from_store == null || distance_from_store.equals("")) {
        System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
        intValue = Integer.parseInt(distance_from_store);
        return true;
    } catch (NumberFormatException e) {
    }
    return false;
}
}

