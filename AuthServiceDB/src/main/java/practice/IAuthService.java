package practice;

public interface IAuthService {
    boolean add(String loginParam, String passwordParam);
    void check(String loginParam, String passwordParam);
}
