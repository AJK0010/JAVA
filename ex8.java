class ex8 {
    // Generic method to find maximum element
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0]; // assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Float array (CGPA)
        Float[] cgpa = {8.5f, 9.2f, 7.9f, 9.5f};
        System.out.println("Highest CGPA: " + findMax(cgpa));

        // Integer array (Total Marks)
        Integer[] total = {450, 480, 499, 470};
        System.out.println("Highest Total: " + findMax(total));

        // String array (Names)
        String[] names = {"Arun", "Divya", "Kiran", "Meena"};
        System.out.println("Last Name Alphabetically: " + findMax(names));
    }
}
