package powergrid;

public class PowerGrid {

	/**
	 * Given loads a, b, and c, at three power stations, is it possible to
	 * balance the load using the permitted operation?
	 * 
	 * @param a
	 *            the load at Power Station A, a >= 0
	 * @param b
	 *            the load at Power Station B, b >= 0
	 * @param c
	 *            the load at Power Station C, c >= 0
	 * @return true if load balancing is possible and false otherwise
	 */
	public static boolean canLoadBalance(int a, int b, int c) {
		// TODO: implement this method


          for(int i=0; (i<1000)&&((a!=b)||(b!=c)||(a!=c));i++) {
              if (a > b) {
                  a = a - b;
                  b = b * 2;
              }
              if (b > c) {
                  b = b - c;
                  c = c * 2;
              }
              if (a < b) {
                  b = b - a;
                  a = a * 2;
              }
              if (b < c) {
                  c = c - b;
                  b = b * 2;
              }
          }

        if(a==b&&b==c){
            return true;
        }else{
            return false;
        }

	}

}
