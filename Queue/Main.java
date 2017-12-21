public class Main{
  public static void main(String[] args) {
    Queue generalQueue = new Queue();
    Queue queue10 = new Queue(10);
    
    generalQueue.enqueue(10);generalQueue.showData(0);
    queue10.enqueue(10);
    generalQueue.enqueue(20);generalQueue.showData(1);
    queue10.enqueue(20);
    generalQueue.enqueue(30);
    queue10.enqueue(30);
    generalQueue.enqueue(40);
    queue10.enqueue(40);
    generalQueue.enqueue(50);
    queue10.enqueue(50);
    generalQueue.enqueue(60);
    queue10.enqueue(60);
    
    System.out.println(generalQueue.dequeue());
    ;
    //queue10.dequeue();
    
    generalQueue.showData();
    queue10.showData();
    System.out.println(Queue.queueCount);
  }
}

