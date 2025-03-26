class QueueUsingArray {
    private int arr[];
    private int front, rear, capacity;

    public QueueUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        front = rear = 0;
    }

    public void enqueue(int x) {
        if (rear == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[rear++] = x;
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }

    public int peek() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }
}
