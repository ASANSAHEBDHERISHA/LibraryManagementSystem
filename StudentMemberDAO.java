package Library;

import jakarta.persistence.EntityManager;

public class StudentMemberDAO {

    public void save(StudentMember student) {

        EntityManager em = HibernateUtil.getEntityManager();

        em.getTransaction().begin();

        em.persist(student);

        em.getTransaction().commit();

        em.close();

    }

 

    public StudentMember findById(Long id) {

        EntityManager em = HibernateUtil.getEntityManager();

        StudentMember student = em.find(StudentMember.class, id);

        em.close();

        return student;

    }

}

 

 
