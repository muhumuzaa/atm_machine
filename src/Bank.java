import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public Bank(){
        accounts.put("548945", new Account("548945", "3333", 54));
        accounts.put("548946", new Account("548946", "3335", 54));

    }

    public Account authenticate(String AcntNumber, String pin){
        Account acnt = accounts.get(AcntNumber);
        if(acnt != null && acnt.validatePin(pin)){
            return acnt;
        } return null;
    }
}