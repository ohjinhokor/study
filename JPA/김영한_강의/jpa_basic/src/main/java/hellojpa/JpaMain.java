package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code

    try{
//        Member member = new Member();
//        member.setId(2L);
//        member.setName("HelloB");
//        em.persist(member);
//        Member findMember = em.find(Member.class, 1L);
//        System.out.println("findMember.getId() = " + findMember.getId());
//        System.out.println("findMember.getName() = " + findMember.getName());
//
////        em.remove(findMember);
//        findMember.setName("helloJPA");
//
//        tx.commit();
//
//        List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                .setFirstResult(5)
//                .setMaxResults(8)
//                .getResultList();
//
//        for (Member member : result) {
//            System.out.println("member.getName() = " + member.getName());
//        }

        //비영속
//        Member member = new Member();
//        member.setId(101L);
//        member.setName("HelloJPAAA");
//
//        //영속
//        System.out.println("=== BEFORE ===");
//        em.persist(member);
//        System.out.println("=== AFTER ===");

//        Member findMember1 = em.find(Member.class, 101L);
//        Member findMember2 = em.find(Member.class, 101L);
//        // 이처럼 조회를 2번할 시에는, 1번은 1차캐시에서 데이터를 가지고 온다.
//
//        System.out.println(findMember1 == findMember2);
//        //영속성 콘텍스트
//
//        Member member1 = new Member(150L, "A");
//        Member member2 = new Member(151L, "B");
//
//        em.persist(member1);
//        em.persist(member2);
////        System.out.println("findMember.id = " + findMember.getId());
////        System.out.println("findMember.getName() = " + findMember.getName());

//        Member member = em.find(Member.class, 150L);
//        member.setName("ABCD");
//
//        //  em.persist(member) 할 필요 없음
//
//        System.out.println("====================");
//        Member member = new Member(200L, "member200");
//        em.persist(member);
//
//        em.flush();
//
        Member member = em.find(Member.class, 150L);
        member.setName("ABCD");

        //em.detach(member);
        //em.clear();
        //em.close();
        
        System.out.println("====================");

        tx.commit();
    } catch(Exception e) {
        tx.rollback();
        }
    finally{
            em.close();
        }
        emf.close();
    }
}
