package github.asuralg.mock;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author LiGen
 * @date 2021/10/07
 */
@RunWith(JMockit.class)
public class DemoTest {
    @Tested
    public Demo demo;

    @Injectable
    public BeanDAO beanDao;

    @Test
    public void testForSaveBean() {
        new Expectations() {{
            beanDao.saveBean((Bean)any);
            result = true;
        }};
        Bean bean = new Bean(1L, "bean");
        demo.setBeanDao(beanDao);
        boolean res = demo.saveBean(bean);
        Assert.assertTrue(res);
    }
}
