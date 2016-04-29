import java.util.ArrayList;


public class Definition{
  private String mDefinition;
  private int mId;
  private static ArrayList<Definition> theDefinitions = new ArrayList<Definition>();

  public Definition(String mDefinition){
  //   mVariable = variable;
  //
  // public String getVariable()
  //   return mVariable;
  }
    public static ArrayList<Definition> all(){
      return theDefinitions;
    }
}
