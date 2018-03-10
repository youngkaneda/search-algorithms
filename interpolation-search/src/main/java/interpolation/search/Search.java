/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpolation.search;

/**
 *
 * @author juan
 */
public class Search {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] array = {4, 12, 23, 29, 34, 45, 46, 50, 55, 57};
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
        while (lo <= hi && x >= array[lo] && x <= array[hi]) {
            //
            pos = lo + ((hi - lo) / (array[hi] - array[lo])) * (x - array[lo]);
            //
            if (array[pos] == x) {
                return pos;
            }else if (array[pos] < x) {
                lo = pos + 1;
                continue;
            }
            hi = pos - 1;
        }
        return -1;
    }

}
