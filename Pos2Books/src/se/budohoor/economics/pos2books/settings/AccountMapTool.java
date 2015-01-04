package se.budohoor.economics.pos2books.settings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.persistence.Query;

public class AccountMapTool {
    private static final Logger log = Logger.getLogger(AccountMapTool.class.getName());
    private static AccountMapTool instance;
    private Map<String, Integer> accountMap = new HashMap<String, Integer>();

    private AccountMapTool() {
        super();
    }

    public static AccountMapTool getInstance() {
        if (instance == null) {
            init();
        }
        return instance;
    }
    
    private static void init() {
        instance = new AccountMapTool();
        Query accountMapQuery = Settings.getInstance().getEM().createNamedQuery("AccountMap.findAll");
        Collection<AccountMap> accountMappings = accountMapQuery.getResultList();
        for (AccountMap am : accountMappings) {
            instance.accountMap.put((String) am.getName(), am.getAccount());
        }
        
    }

    public Integer getAccountByItemCategory(String itemCategory) {
        int accountNo = 0;
        try {
            accountNo = accountMap.get(itemCategory);
            log.info("Category[" + itemCategory + "] --> Account[" + accountNo +"]");
        } catch (NullPointerException npe) {
            log.warning("Account not found for Category[" + itemCategory + "]!");
        }
        return new Integer(accountNo);
    }
    
    public void logAccountMap() {
        for (String key : accountMap.keySet()) {
            log.info(key + " --> " + accountMap.get(key));
        }
    }
}
