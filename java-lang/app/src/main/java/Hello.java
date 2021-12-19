public class Hello {

  public static void main(String[] args) throws Exception {
    System.out.println(System.getProperty("java.class.path"));
    System.out.println("Hello2");

    int[] arr = new int[5];

    arr[1] = 12;
    arr[2] = 22;

    int[] arr2 = arr;

    arr[1] = 122;

    System.out.println(arr[1]);
    System.out.println(arr2[1]);

    arr = null;
    arr[1] = 21;
    System.out.println(arr[1]);

    int a = 1;
    int a2 = a;

    a = 3;

    System.out.println(a);
    System.out.println(a2);
  }

}
