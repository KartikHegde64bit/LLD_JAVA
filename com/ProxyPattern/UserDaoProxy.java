
import com.ProxyPattern.UserDao;

/**
 * This is a Proxy Layer which is performing the role of Access Restriction on UserDao object
 * Other types of Proxies such as Pre and Post processors are also used in Industries
 */
public class UserDaoProxy implements UserDao {
    private UserDao userDao;

    @Override
    public Long getUserId(String role) throws Exception {
        if(role.equals("ADMIN") || role.equals("USER")) {
            return userDao.getUserId(role);
        }
        throw new Exception("Access Denied");
    }

    @Override
    public String getUserName(String role) throws Exception {
        if(role.equals("ADMIN") || role.equals("USER")) {
            return userDao.getUserName(role);
        }
        throw new Exception("Acess Denied");
    }

    @Override 
    public void setUserId(Long userId, String role) throws Exception {
        if(role.equals("ADMIN")) {
            userDao.setUserId(userId, role);
        }   
        throw new Exception("Only Admin can access");
    }

    @Override
    public void setUserName(String userName, String role) throws Exception {
        if(role.equals("ADMIN")) {
            userDao.setUserName(userName, role);
        }
        throw new Exception("Only Admin can access");
    }
}
