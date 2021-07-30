package hello.core.singleton;

public class SingletonService {

    // static에 인스턴스 만들어서 올려놓는게 포인트
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    // 생성자를 private로 선언하여 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}