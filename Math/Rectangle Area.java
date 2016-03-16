public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        // if((A > G) || (C < E) || (D < F) || (H < B)) return 0；
       int all = (C - A) * (D - B) + (G - E) * (H - F);
        int lbx = Math.max(A, E);
        int lby = Math.max(B, F);
        int rtx = Math.min(C, G);
        int rty = Math.min(D, H);

        int width = rtx - lbx;
        int height = rty - lby;

        int result = 0;
        if (rtx > lbx && rty > lby) {
            result = width* height;
        }
        return all - result;
    }
}