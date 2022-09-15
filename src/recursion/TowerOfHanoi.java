package recursion;

import javax.print.attribute.standard.Destination;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // base case
        if (disks == 0) {
            return;
        }
        // moving n - 1 disks from source to the helper using destination
        towerOfHanoi(disks - 1, source, destination, auxiliary);
        System.out.println("Moving Disk from " + source + " to " + destination);
        // moving n - 1 disks from helper to the destionation using source
        towerOfHanoi(disks - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        towerOfHanoi(4, 'S', 'H', 'D');
    }
}
