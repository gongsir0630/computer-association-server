package club.gongsir.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件位置
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DaoTest {
}