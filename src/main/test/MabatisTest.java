import com.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.InputStream;

public class MabatisTest {
    private InputStream inputStream;
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void Sqlsession() throws Exception{
    }
    @Test
    public void testFindAll() throws Exception{

    }
}
