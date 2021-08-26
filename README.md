# HMap
### HashMap이란?
 - Map 인터페이스를 구현한 대표적인 Map 컬렉션
 - Map 인터페이스를 구현한 Map 컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식인 key-value

#### <특 징>
 - 요소의 저장 순서를 유지하지 않는다.
 - key는 중복 O, value는 중복 X
 
### Map 컬렉션 클래스 종류
 - HashMap<K, V>
 - Hashtable<K, V>
 - TreeMap<K, V>

### HashMap<K, V>
- Hash 알고리즘을 이용하여 검색 속도빠름
- Map 인터페이스를 구현하므로, 중복된 키로는 값 저장 NO

### HashMap method
```  java
 // HashMap 생성
 HashMap<Integer,String> map = new HashMap<>(); // new에서 타입 파라미터 생략가능
 map.put(1,"딸기"); // 값 추가 
 map.put(2,"복숭아");
 map.put(3,"포도");
``` 
