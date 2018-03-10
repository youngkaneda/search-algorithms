/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponential.search;

/**
 *
 * @author juan
 */
public class Search {

    public static void main(String[] args) {
        int x = args[0];
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        //
        int position = doSearch(x, array);
        //
        String finalMessage = String.format("%d is in %d position", x, position);
        System.out.println(finalMessage);
    }

    private static int doSearch(int x, int[] array) {
        int n = array.length;
        int exp = 1;
        //
        if (array[0] == x) {
            return 0;
        }
        //
        exp = 2;
        //
        while (exp < n && array[exp] < x) {
            exp *= 2;
        }
        //
        if (exp > n) {
            exp = n;
        }
        //
        int prv = exp/2;
        //binary search
        int pos;
        while (prv <= exp) {
            pos = (exp + prv) / 2;
            if (array[pos] == x) {
                return pos;
            } else if (array[pos] > x) {
                exp = pos - 1;
                continue;
            }
            prv = pos + 1;
        }
        return -1;
    }
}
