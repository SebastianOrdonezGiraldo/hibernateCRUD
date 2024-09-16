import entidades.Facultad;
import jakarta.persistence.EntityManager;
import utilidades.JpaUtil;

import java.util.List;

public class HibernateList {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Facultad> facultade = em.createQuery("from Facultad ", Facultad.class).getResultList();
        facultade.forEach(System.out::println);
    }
}
