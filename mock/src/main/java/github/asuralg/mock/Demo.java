package github.asuralg.mock;

import lombok.Setter;

/**
 * @author LiGen
 * @date 2021/10/07
 */
@Setter
public class Demo {
    private BeanDAO beanDao = null;

    public boolean saveBean(Bean bean) {
        return beanDao.saveBean(bean);
    }

    public boolean deleteBean(long id) {
        return beanDao.deleteBean(id);
    }
}
