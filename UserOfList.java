/**
 Test list features.
 */
public class UserOfList {
    private static OrderedList_inArraySlots list;
    
    public static void main( String[] args ) {
        list = new OrderedList_inArraySlots();
        list.add(0);
        list.add(2);
        list.add(1);
        System.out.println("Add test + toString: expect [0, 1, 2]");
        System.out.println(list);
        list.size();
        System.out.println("Size: expect 3");
        System.out.println(list.size());
        System.out.println("Get: expect 1");
        System.out.println(list.get(1));
        list.add(-1);
        list.remove(1);
        System.out.println("Remove + toString: expect [-1,1,2,]");
        System.out.println(list);
    }
}