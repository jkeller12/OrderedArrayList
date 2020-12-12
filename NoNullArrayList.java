import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>
{
  public NoNullArrayList()
  {
    super();

  }

  public NoNullArrayList(int startingCapacity)
  {
    super(startingCapacity);
  }





  public boolean add(T value)
  {
    if(value == null)
    {
      throw new IllegalArgumentException("Null was added");
    }
    super.add(value);
    return true;

  }

  public void add(int index, T value)
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
