/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search;

/**
 *
 * @author juan
 */
public class Search {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] array = {2, 6, 12, 15, 22, 28, 34, 50, 51, 68};
        //
        int position = doSearch(x, array);
        //
        String finalMessage = String.format("%d is in %d position", x, position);
        System.out.println(finalMessage);
    }

    public static int doSearch(int x, int[] array) {
        int lo = 0;
        int hi = array.length - 1;
        int pos;
        //
        while (lo <= hi) {
            pos = (lo + hi) / 2;
            //
            if (array[pos] == x) {
                return pos;
            } else if (array[pos] > x) {
                hi = pos - 1;
                continue;
            }
            lo = pos + 1;
        }
        return - 1;
    }
}
