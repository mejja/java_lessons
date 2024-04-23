public class NamesMain {
    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();
        SurnamePrinter surnamePrinter = new SurnamePrinter();

        namePrinter.print();
        surnamePrinter.print();
    }

    public static class NamePrinter {
        public void print() {
            System.out.println("My name is Major");
        }
    }

    public static class SurnamePrinter {
        public void print() {
            System.out.println("My surname is Mbandi");
        }
    }
}

