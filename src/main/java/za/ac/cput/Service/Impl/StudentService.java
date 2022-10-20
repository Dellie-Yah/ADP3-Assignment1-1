package za.ac.cput.Service.Impl;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Service
 *
 *
 */

import za.ac.cput.Domain.Entity.Student;
import za.ac.cput.Service.IService;
import java.util.List;
import java.util.Optional;

public interface StudentService
{
    public Student save(Student student);
    public Optional<Student> read(long studentID);
    public void delete(Student student);
    public Student update(Student student);
}
