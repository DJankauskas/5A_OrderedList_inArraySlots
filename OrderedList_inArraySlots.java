public class OrderedList_inArraySlots {
    private List_inArraySlots storage;

    public OrderedList_inArraySlots() {
        storage = new List_inArraySlots();
    }

    //Currently an int to allow for sorting, not possible with Objects
    public boolean add(int item) {
        for (int i = 0; i < storage.size(); i++) {
            if (item > storage.get(i)) {
                storage.add(i + 1, item);
                return true;
            }
        }
        storage.add(0, item);
        return true;

    }

    public int remove(int index) {
        return storage.remove(index);
    }

    public String toString() {
        return storage.toString();
    }

    public int get(int i) {
        return storage.get(i);
    }

    public int size() {
        return storage.size();
    }
}