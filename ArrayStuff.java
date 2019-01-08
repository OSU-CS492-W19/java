class ArrayStuff {
  public static void main(String[] args) {
    int[] arr = new int[10];
    int[] arr2 = new int[10];
    // arr = new int[10];

    // arr[1000] = 5;

    arr2 = arr;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i * i;
    }

    for (int elem : arr) {
      System.out.println(elem);
    }

    System.out.println("arr2[5]: " + arr2[5]);
  }
}
