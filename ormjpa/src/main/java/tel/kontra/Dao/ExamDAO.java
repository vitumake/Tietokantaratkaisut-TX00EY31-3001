package tel.kontra.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tel.kontra.entities.Exam;

public class ExamDAO {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("student_exam_system");

    public void saveExam(Exam exam) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(exam);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}


