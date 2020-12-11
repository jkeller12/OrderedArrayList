import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>
{
  public default( )
  {
    super();

  }

  public startingCapacity()
  {

  }





  public boolean add(T value)
  {
    if(value == null)
    {
      throw new IllegalArgumentException("Null was added");
    }
    super.add(value);

  }

  public boolean add(int index, T value)
  {
    if(value == null)
    {
      throw new IllegalArgumentException("Null was added");
    }
    super.add(index, value);


  }

  public T set(int index, T value)
  {
    if(value == null)
    {
      throw new IllegalArgumentException("Null was added");
    }
    super.set(index, value);

  }


}
