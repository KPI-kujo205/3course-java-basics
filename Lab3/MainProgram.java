package Lab3;

import Lab3.modules.*;
import java.util.Arrays;
import java.util.Comparator;

public class MainProgram {
    /**
     *
     * @summary
     *          Creates an array of objects of a class NPC
     *          Sorts the array by one field in ascending order and by another field in descending
     *          order,
     *          using standard sorting methods.
     *
     *          Then fins in the array an object that is identical to a given one.
     *
     * @see -
     *      https://docs.google.com/document/d/1V8_p1Ei0C5j84yEr4GP7jdOLpPSg_fT_BzuFLDkZobo/edit?tab=t.0
     */
    public static void main(String args[]) {
        NPC[] array = {
                new NPC("Adam", NPC.Sex.MALE, 31, 9001, -3),
                new NPC("Eva", NPC.Sex.FEMALE, -3, 31, 41),
                new NPC("John", NPC.Sex.MALE, -213, 33, -30),
                new NPC("Borat", NPC.Sex.MALE, -1488, 69, 228),
                new NPC("Svetlana", NPC.Sex.FEMALE, 100, 100, 100)
        };

        Comparator<NPC> NPCComparator = Comparator.comparing((NPC npc) -> npc.name)
                .thenComparing((NPC npc) -> npc.x)
                .thenComparing((NPC npc) -> npc.y)
                .thenComparing((NPC npc) -> npc.z)
                .thenComparing((NPC npc) -> npc.sex);

        Comparator<NPC> NPCReversedComparator = NPCComparator.reversed();

        System.out.println("\nNPCs before sorting:\n" + Arrays.toString(array));

        Arrays.sort(array, NPCComparator);
        System.out.println("\nNPCs after ascending sorting:\n" + Arrays.toString(array));

        Arrays.sort(array, NPCReversedComparator);
        System.out.println("\nNPCs after descending sorting:\n" + Arrays.toString(array));

        Arrays.sort(array, NPCComparator);

        NPC searchNPC = new NPC("John", NPC.Sex.MALE, -213, 33, -30);
        int foundItemIndex = Arrays.binarySearch(array, searchNPC, NPCComparator);

        if (foundItemIndex >= 0) {
            System.out.println("\nActual item: " + searchNPC +
                    "\nFound item: " + array[foundItemIndex]);
        } else {
            System.out.println("\nItem not found in the array");
        }
    }
}

