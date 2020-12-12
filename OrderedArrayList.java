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
    for(int i = 0 ; i < super.size(); i++)
    {
      if(value.compareTo(super.get(i)) > 0)
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
    super.add(CorrectIndex(value), value);
    return true;
  }

  public void add(int index, T value)
  {
    for(int j = super.size(); j > CorrectIndex(value); j--)
    {
      super.set(j, super.get(j-1));
    }
    super.add(CorrectIndex(value), value);

  }

  public T set(int index, T value)
  {
    super.remove(index);
    add(CorrectIndex(value), value);
    return value;
  }


}
