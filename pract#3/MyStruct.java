import java.util.*;
import java.lang.*;

class MyStruct {

    public static void main(String[] args) {

        show("First");
        System.out.print("Enter size of array : ");
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 10;
        int[] big_arr = new int[arr.length + 10];
        System.arraycopy(arr, 0, big_arr, 0, arr.length);
        System.out.print("The array is increased by 10 elements : ");
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
        System.out.println();
        getch();

        show("Fifth");
        TreeSet<String> treeSet = new TreeSet<String>(arrayList);
        Iterator<String> iterator = treeSet.iterator();
        System.out.println("Elements in TreeSet : ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        getch();

        show("Sixth");
        System.out.println("Index of object \"Tim\" in ArrayList is : "
                + (arrayList.indexOf("Tim") >= 0 ? arrayList.indexOf("Tim") : "object not found"));
        System.out.println("Is HashMap contains value \"Bob\"? " + (hashMap.containsValue("Bob") == true ? "Yes" : "No"));
        System.out.println("Is HashMap contains key \"35\"? " + (hashMap.containsKey(35) == true ? "Yes" : "No"));
        getch();

        show("Seventh");
        int searchKey = Math.abs(new Random().nextInt() % 10);
        int keyIndex = Arrays.binarySearch(arr1, searchKey);
        System.out.println("Index of " + searchKey + " in array of third task is : " +
                (keyIndex >= 0 ? keyIndex : "element not found"));
        getch();

        show("Eighth");
        System.out.println("Converting ArrayList to Array of objects...");
        for (Object e : arrayList.toArray())
            System.out.print(e + " ");
        System.out.println();
        getch();

        show("Ninth");
        System.out.println("Converting HashMap to Array...");
        Object[] hashMapValuesArray = hashMap.values().toArray();
        Object[] hashMapKeysArray = hashMap.keySet().toArray();
        Object[] resultArray =
                new Object[hashMapKeysArray.length + hashMapValuesArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (i % 2 == 0) {
                System.arraycopy(hashMapKeysArray, i%3 , resultArray, i, 1);
                System.out.print(resultArray[i] + " ");
            } else {
                System.arraycopy(hashMapValuesArray, (i-1)%3 , resultArray, i, 1);
                System.out.println(resultArray[i]);
            }
        }
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
