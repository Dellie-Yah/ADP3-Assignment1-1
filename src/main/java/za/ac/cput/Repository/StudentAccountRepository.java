package za.ac.cput.Repository;
/**
 *
 * Keziah Robinson
 * 219113149
 * StudentAccount Repository
 *
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Entity.Student;
import za.ac.cput.Domain.Entity.StudentAccount;
import java.util.List;
import java.util.Optional;

public interface StudentAccountRepository extends JpaRepository<StudentAccount, String> {
    StudentAccount save(StudentAccount student);
    Optional<StudentAccount> read(String id);
    List<StudentAccount> readAll();
    public StudentAccount update(Student student);
    void delete(String id);
}