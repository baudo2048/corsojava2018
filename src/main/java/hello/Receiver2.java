package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jp.assignment.nogen.Message;


@Component
public class Receiver2 {
	
	@Autowired
	private Repository repository;
	
    @JmsListener(destination = "msgbox", containerFactory = "myFactory")
    public void receiveMessage(Message msg) {
    	
    	switch(msg.getType()) {
    	case INS_ONE:   
    		repository.insert(msg.getSale());
    		break;
    	case INS_N:
    		repository.insertN(msg.getSale(), (MessageB)msg.getQ());
    		break;
    	case UPD:
    		repository.update(msg.getSale(), msg.getOp());
    		break;
    	}

    }
}

/**
 * 11.30 Monday - call
 * 
 * Capgemini - 
 * 
 * 1 - 11 am - 12 telephone
 * *
 */
