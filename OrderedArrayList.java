public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
{
  public OrderedArrayList()
  {
    super();
  }

  public OrderedArrayList(int startingCapacity)
  {
    super(startingCapacity);
  }

  private int CorrectIndex(T value)
  {
    if(value == null)
    {
      throw new IllegalArgumentException("Null was added");
    }
    if(super.size() == 0 )
    {
      return 0;
    }
    for(int i = 0 ; i < super.size(); i++)
    {
      if(value.compareTo(super.get(i)) < 0)
      {
        return i;
      }

    }

    return super.size();
  }

  public boolean add(T value)
  {
    for(int j = super.size(); j > CorrectIndex(value); j--)
    {
      super.set(j, super.get(j-1));
    }
    super.set(CorrectIndex(value), value);
    return true;
  }

  public void add(int index, T value)
  {
    add(value);
  }

  public T set(int index, T value)
  {
    if (value == null)
    {
      throw new IllegalArgumentException("Null added in set");
    }
    T rem_val = super.get(index);

    super.remove(index);
    add(value);

    return rem_val;
  }


}
