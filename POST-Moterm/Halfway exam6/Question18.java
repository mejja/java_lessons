public class Question18 {
    public static void main(String[] args) {
        // Create an instance of Question18
        Question18 question = new Question18();
        
        // Call someMethod using the instance
        question.someMethod("apple", "banana", "orange");
        question.someMethod(); // Valid, since $n can be empty
    }

        public void someMethod(String... $n) {
        // $n is treated as an array of Strings
        for (String str : $n) {
            System.out.println(str);
        }
    }
}
