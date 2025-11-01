class PracticeProblem {
    public static void main(String[] args) {
        char[] letters = {'d', 'a', 'c', 'b'};
        insertionSort(letters);
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
    }

    public static void insertionSort(char[] characters) {
        for (int i = 1; i < characters.length; i++) {
            char key = characters[i];
            int j = i - 1;
            while (j >= 0 && characters[j] > key) {
                characters[j + 1] = characters[j];
                j--;
            }
            characters[j + 1] = key;
        }
    }
}
