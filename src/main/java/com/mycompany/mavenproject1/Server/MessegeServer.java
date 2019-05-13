/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Server;

import com.mycompany.mavenproject1.Database.DBClass;
import com.mycompany.mavenproject1.model.Messege;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hp
 */
public class MessegeServer {

    private Map<Long, Messege> Messeges = DBClass.getMessages();

    public MessegeServer() {

        Messeges.put(1L, new Messege(1, "hello", "karem"));
        Messeges.put(2L, new Messege(2, "welcome", "sasa"));

    }

    public List<Messege> getAllmessage() {
        return new ArrayList<Messege>(Messeges.values());
    }

    public Messege getMsg(long id) {

        return Messeges.get(id);
    }

    public Messege addMessage(Messege messege) {

        messege.setId(Messeges.size() + 1);
        Messeges.put(messege.getId(), messege);
        return messege;

    }

    public Messege updateMessege(Messege messege) {

        if (messege.getId() <= 0) {
            return null;
        }
        Messeges.put(messege.getId(), messege);
        return messege;
    }

    public Messege RemoveMessege(long id) {

        return Messeges.remove(id);

    }

//    public ArrayList<Messege> getmesg(){
//        
//        Messege m1 = new Messege(1,"the first is good","kareem");
//        Messege m2 = new Messege(2,"the sec is Bad","Mahmoud");
//        ArrayList<Messege> list = new ArrayList<>();
//       list.add(m1);
//       list.add(m2);
//       return list ;  
//         
//               }
}
