package tel.kontra.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tel.kontra.entities.Student;

import java.util.List;

public class StudentDAO {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("student_exam_system");

    public void saveStudent(Student student) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Student> getAllStudents() {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        List<Student> students = entityManager.createQuery("from Student", Student.class).getResultList();
        entityManager.close();
        return students;
    }
}

