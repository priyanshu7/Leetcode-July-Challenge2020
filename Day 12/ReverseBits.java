package july2020;

public class ReverseBits {
	
	/*
	 * 16 bits left and right swapped every couple of 8 bits swapped (every other 8
	 * bits are picked by AND operation and 00ff and ff00 as masks equivalent to
	 * 0000000011111111 and 1111111100000000) every couple of 4 bits are swapped
	 * like above using 0f0f and f0f0 as masks. every couple of 2 bits are swapped
	 * using cc and 33 corresponding to 11001100 and 0011011 every couple of 1 bit
	 * are swapped using aa and 55 corresponding to 10101010 and 01010101
	 */
	
	public int reverseBits(int n) {
        int ret=n;
        ret = ret >>> 16 | ret<<16;
        ret = (ret & 0xff00ff00) >>> 8 | (ret & 0x00ff00ff) << 8;
        ret = (ret & 0xf0f0f0f0) >>> 4 | (ret & 0x0f0f0f0f) << 4;
        ret = (ret & 0xcccccccc) >>> 2 | (ret & 0x33333333) << 2;
        ret = (ret & 0xaaaaaaaa) >>> 1 | (ret & 0x55555555) << 1;
        return ret;
    }
	
	public int reverseBitsAlt(int n) {
            int result = 0;
    	    for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   
            if (i < 31) 
                result <<= 1;
            }
        return result;
    }

}
