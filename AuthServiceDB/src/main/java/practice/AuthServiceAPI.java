package practice;

import org.postgresql.util.PSQLException;
import practice.IAuthService;

public class AuthServiceAPI implements IAuthService {

    public byte add(String loginParam, String passwordParam) {
        try {
            return DBProccesor.insert(loginParam, passwordParam);
        } catch (PSQLException e) {
            e.setStackTrace();
        }
    }

    public void check(String loginParam, String passwordParam) {

    }
}
