/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump.search;

/**
 *
 * @author juan
 */
public class Search {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] array = {1, 1, 15, 23, 25, 33, 40, 46, 53, 55};
        //
        int position = doSearch(x, array);
        //
        String finalMessage = String.format("%d is in %d position", x, position);
        System.out.println(finalMessage);
    }

    private static int doSearch(int x, int[] array) {
        int n = array.length;
        int jump = (int) Math.round(Math.sqrt((double) n));
        int pos = 0;
        //
        while (array[Math.min(n, jump) - 1] < x) {
            pos = jump;
            jump += (int) Math.round(Math.sqrt((double) n));
            if (pos >= n) {
                return -1;
            }
        }
        //linear search
        while (array[pos] < x) {
            pos++;
            //
            if (pos == n || pos == jump) {
                return -1;
            }
        }
        return pos;
    }

}
