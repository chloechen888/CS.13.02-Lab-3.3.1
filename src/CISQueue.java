import java.util.LinkedList;

public class CISQueue{
    private LinkedList<Integer> queue;
    private int Size;

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + queue +
                ", size=" + Size +
                '}';
    }

    public CISQueue()
    {
        queue = new LinkedList<>();
        Size = 0;
    }

    public int size()
    {
        return Size;
    }

    public void enqueue(int value) {
        queue.addLast(value);
        Size++;
    }

    public Integer dequeue()
    {
        if(isEmpty())
        {
            return null;
        }
        Integer dequeuedValue = queue.remove();
        Size--;
        return dequeuedValue;
    }

    public boolean isEmpty() {
        return Size == 0;
    }




    // Linked list property.

    // Size property.

    // Constructor.

    // Enqueue. This method adds a node to the end of the linked list.

    // Dequeue. This method removes a node from the beginning of the linked list.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}

}
