
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0648185
 */
public class MessageController {
    private List<Message> message;

    public List<Message> getAllMessage() {
        return message;
    }

    public Message getById(int id){
        for (int i = 0; i < message.size(); i++) {
           if ( message.get(i).getId() == id) {
             return message.get(i);
           }
        }
        return null;
    }
    
//   public List<Message> getByDate(Date from,Date to) {
//        for (int i = 0; i < message.size(); i++){
//           
//        }
//       
//   }
   public void add(Message msg){
    
       message.add(msg);
   } 
   public void edit(int id, Message msg){
      for (int i = 0; i < message.size(); i++){
          if (message.get(i).getId() == id){
         message.set(i, msg);
          }
      } 
           
   }
   public void remove(int id){
       for (int i = 0; i < message.size(); i++){
         if (message.get(i).getId() == id){
             message.remove(i);
         }  
       } 
   }
   
   
}


