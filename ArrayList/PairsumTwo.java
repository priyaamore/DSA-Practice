package ArrayList;
import java.util.*;


public class PairsumTwo {

    public static boolean pairtwo(ArrayList<Integer> list, int target) {
        if (list == null || list.size() < 2) {
            return false;
        }

        int pivot = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            pivot = list.size() - 1;
        }

        int left = (pivot + 1) % list.size();
        int right = pivot;

        while (left != right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                left = (left + 1) % list.size();
            } else {
                right = (right - 1 + list.size()) % list.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(15);

        System.out.println(pairtwo(list, 9));
        System.out.println(pairtwo(new ArrayList<>(), 5));
        System.out.println(pairtwo(null, 5));
    }
}

