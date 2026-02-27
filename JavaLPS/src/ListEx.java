import java.util.*;
public class ListEx {
    public static void main(String[] args) {
        List <Integer> arr=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"\t");
        }
        System.out.println();
        map.put("Shraddha",100);
        map.put("Manasi",98);
        map.put("Suhani",95);
        map.put("Mrudula",90);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+"-----");
            System.out.println(entry.getValue());
            System.out.println("------");
        }
        System.out.println(map.get("Suhani")>20);
        int [] arr1={1,2,3,4};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
Optional<Integer>marks=Optional.ofNullable(map.get("Rohit"));
        if(marks.isPresent()){
            System.out.println(marks.get());
        }else{
            System.out.println("No such key");
        }
    }
}
