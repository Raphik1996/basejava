import java.util.Arrays;
/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume resume) {
        if (size < storage.length) {
            storage[size] = resume;
            size++;
        }
    }

    Resume get(String uuid) {
        for (int i=0;i<size;i++){
            if(storage[i].uuid==uuid){
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return new Resume[0];
    }

    int size() {
        return 0;
    }
}
