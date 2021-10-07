package github.asuralg.mock;

/**
 * @author LiGen
 * @date 2021/10/07
 */
public interface BeanDAO {
    boolean saveBean(Bean bean);

    boolean deleteBean(Long id);
}
