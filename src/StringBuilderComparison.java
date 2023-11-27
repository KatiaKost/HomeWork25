class StringBuilderComparison {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("World");
        StringBuilder sb3 = new StringBuilder("Hello");

        System.out.println("Cовпадают ли sb1 b sb3? " + ravenstvo(sb1, sb2)); // Выводит false
        System.out.println("Cовпадают ли sb1 b sb3? " + ravenstvo(sb1, sb3)); // Выводит true
    }
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        return sb1.toString().equals(sb2.toString());
    }
}