package Service;

import java.util.List;

public interface BaseService<T> {

    List<T> getAll();

    boolean save(T t);

    boolean upDate(T t);
    boolean delete(int id);
}
