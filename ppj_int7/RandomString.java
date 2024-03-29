import java.security.SecureRandom;
import java.math.BigInteger;
import java.util.Random;

public final class RandomString {
  private SecureRandom random = new SecureRandom();
  private Random randomInt = new Random();

  public String[] next() {
	int length = randomInt.nextInt(100);
	String [] res = new String[length];
	for(int i = 0; i<length; i++) {
		res[i] = new BigInteger(130, random).toString(32);
		res[i].toCharArray();
	} 
    return res;
  }
}
