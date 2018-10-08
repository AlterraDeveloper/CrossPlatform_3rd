import java.util.*;
import java.lang.*;

class MyStruct {
    public static void main(String[] args) {
        show("First");
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 10;
        int[] big_arr = new int[arr.length + 10];
        System.arraycopy(arr, 0, big_arr, 0, arr.length);
        for (int i : big_arr)
            System.out.print(i + " ");
        System.out.println();
        getch();

        show("Second");
        Integer key1 = 10, key2 = 20, key3 = 30;
        String obj1 = "Tom", obj2 = "Mike", obj3 = "Bob";
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(key1, obj1);
        hashMap.put(key2, obj2);
        hashMap.put(key3, obj3);
        System.out.println("Value with key " + key2 + " is " + hashMap.get(key2));
        getch();

        show("Third");
        int[] arr1 = {5, 4, 7, 8, 2, 5, 4, 7, 1, 9};
        System.out.print("Unsorted array : ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        Arrays.sort(arr1);
        System.out.print("\nSorted array : ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        getch();

        show("Fourth");
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj1);
        arrayList.add(obj2);
        arrayList.add(obj3);
        System.out.print("Unsorted ArrayList : ");
        for (Object e : arrayList)
            System.out.print(e + " ");
        Collections.sort(arrayList);
        System.out.print("\nSorted ArrayList : ");
        for (Object e : arrayList)
            System.out.print(e + " ");
        getch();

        show("Fifth");
        TreeSet<String> treeSet = new TreeSet<String>(arrayList);
        Iterator<String> iterator = treeSet.iterator();
        System.out.println("Elements in TreeSet : ");
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        getch();
    }


    public static void show(String msg) {
        System.out.println("==========");
        System.out.println(msg + " task");
        System.out.println("==========");
    }

    public static void getch() {
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
