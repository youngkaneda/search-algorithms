/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear.search;

/**
 *
 * @author Kuuhaku
 */
public class Search {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //
        int position = doSearch(x, array);
        //
        String finalMessage = String.format("%d is in %d position", x, position);
        System.out.println(finalMessage);
    }

    public static int doSearch(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
