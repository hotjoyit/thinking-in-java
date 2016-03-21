package thinking.in.java.annotation.db;

/**
 * Created by hotjoyit on 16. 3. 21.
 */

public @interface Uniqueness {
  Constraints constraints()
      default @Constraints(unique = true);
}
