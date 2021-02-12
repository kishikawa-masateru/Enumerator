# Enumerator

Pythonの **enumerate** 関数のJava版です．

## enumerate 関数とは

enumerate 関数とは，下の例のように，リストの要素と添え字を一ずつ取り出す関数です．
```python
l = ["saga", "fukuoka", "nagasaki", "kumamoto"]

for i, e in enumerate(l):
    print(i, e)
    # 出力
    # 0 saga
    # 1 fukuoka
    # 2 nagasaki
    # 3 kumamoto
```

## Java での実装

上記 **enumerate** 関数を Java で実装した本ライブラリは以下のように使います．
```java
import java.util.*;

public class Main{
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("saga");
        l.add("fukuoka");
        l.add("nagasaki");
        l.add("kumamoto");

        for(Element<String> e : Enumerate.enumerate(l)){
            System.out.println(e.v + " " + e.i);
            /* 出力
            0 saga
            1 fukuoka
            2 nagasaki
            3 kumamoto
            */
        }
    }
}
```
## 今後の実装

今後の実装としては，**filter** 関数を実装して，特定の要素だけを取り出すようにします．  
その際に，添え字を変更するか，しないかを指定できるようにするつもりです．

```java
import java.util.*;

public class Main{
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("saga");
        l.add("fukuoka");
        l.add("nagasaki");
        l.add("kumamoto");

        for(Element<String> e : Enumerate.filter(e -> e.v == "nagasaki", true)
        .enumerate(l)){
            System.out.println(e.v + " " + e.i);
            /* 出力
            0 nagasaki
            */
        }

        for(Element<String> e : Enumerate.filter(e -> e.v == "nagasaki", false)
        .enumerate(l)){
            System.out.println(e.v + " " + e.i);
            /* 出力
            2 nagasaki
            */
        }
    }
}
```