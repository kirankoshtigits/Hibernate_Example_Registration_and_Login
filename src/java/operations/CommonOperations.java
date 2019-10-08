/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;


import bean.Users;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Admin
 */
public class CommonOperations {

    Session session=null;
    SessionFactory sessionFactory=sessionFactory=new Configuration().configure().buildSessionFactory(); 
     public Users getLoginDetails(Users user){
         session=sessionFactory.openSession();
         session.beginTransaction();
         String UNAME=user.getUNAME();
         String UPASSWORD=user.getUPASSWORD();
         String SQL_QUERY = "FROM Users users WHERE users.UNAME = '"+UNAME+"' AND users.UPASSWORD= '"+UPASSWORD+"'";         
         Query query = (Query) session.createQuery(SQL_QUERY);        
            for(Iterator it=query.iterate();it.hasNext();)  
            {  
            Users u = (Users)it.next();  
            user.setUID(u.getUID());
            user.setUNAME(u.getUNAME());
            user.setUPASSWORD(u.getUPASSWORD()); 
            user.setValid(true);
            }  
         session.getTransaction().commit();     
         session.close();  
    return user;   
    }
    public Users registerUser(Users user){
        session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        user.setValid(true);
        session.getTransaction().commit();
        session.close();
        return user;
    }
}
