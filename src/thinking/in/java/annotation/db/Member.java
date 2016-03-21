package thinking.in.java.annotation.db;

/**
 * Created by hotjoyit on 16. 3. 21.
 */
@DBTable(name = "MEMBER")
public class Member {
  @SQLString(30)
  String firstName;

  @SQLString(50)
  String lastName;

  @SQLInteger
  String age;

  @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
  String handle;

  static int memberCount;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAge() {
    return age;
  }

  public String getHandle() {
    return handle;
  }

  @Override
  public String toString() {
    return handle;
  }
}
