# プログラム
## Queue.java
```java
class Queue {
public static final int DEFAULT_SIZE = 5;
private int volume;
private int queue[];
static int queueCount;

Queue(){
  this(DEFAULT_SIZE);
}

Queue(int size){ //i個の配列を生成
        queue = new int[size];
        volume = 0;
        System.out.println(queue.length + "個の配列を確保しました");
        queueCount++;
}

//データ追加
public void enqueue(int num){
        if (volume >= queue.length) {
                System.out.println("ERROR: OVER FLOW");
                return;
        }

        queue[volume] = num;
        volume++;
}

//データの取り出し
public int dequeue(){
        if (queue[0] == 0) {
                System.out.println("ERROR: UNDER FLOW");
                return -1;
        }
        int dequeueValue = queue[0];
        volume--;

        //再構築
        for (int i = 0; i < volume-1; i++) {
                queue[i] = queue[i + 1];
                queue[volume] = 0;
        }
        return dequeueValue;
}

//状態表示関数
public void showData(){ //配列の全データを表示
        System.out.print("|");
        for(int i=0; i < queue.length; i++) {
                System.out.print(queue[i]);
                System.out.print("|");
        }
        System.out.println("");
}

public void showData(int n){ //n番目の配列の値を表示
        System.out.print("|");
        System.out.print(queue[n]);
        System.out.println("|");
}

public void showData(int n, int m){ //n番目~m番目の配列の値を表示
        System.out.print("|");
        for(int i = n; i <= m; i++) {
                System.out.print(queue[i]);
                System.out.print("|");
        }
        System.out.println("");
}


}
```

## Main.java
```java
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


```


# 実行結果
```
5個の配列を確保しました
10個の配列を確保しました
|10|
|20|
ERROR: OVER FLOW
10
|20|30|40|40|0|
|10|20|30|40|50|60|0|0|0|0|
2
```